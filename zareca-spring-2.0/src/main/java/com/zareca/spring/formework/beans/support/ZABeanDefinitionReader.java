package com.zareca.spring.formework.beans.support;

import com.zareca.spring.formework.beans.config.ZABeanDefinition;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @Auther: ly
 * @Date: 2020/12/6 21:33
 * @Description:
 */
public class ZABeanDefinitionReader {
    private final String SCAN_PACKAGE = "scanPackage";
    private Properties config = new Properties();
    private List<String> registyBeanClasses = new ArrayList<String>();


    public ZABeanDefinitionReader(String... locations) {
        //通过URL定位找到其所对应的文件，然后转换为文件流
        InputStream is = this.getClass().getClassLoader().getResourceAsStream
                (locations[0].replace("classpath:", ""));
        try {
            config.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        doScanner(config.getProperty(SCAN_PACKAGE));
    }

    private void doScanner(String scanPackage) {
        //转换为文件路径，实际上就是把.替换为/就OK了
        //this.getClass()
//        this.getClass().getClassLoader()
        URL url = this.getClass().getResource("/" + scanPackage.replaceAll("\\.", "/"));
        File classPath = new File(url.getFile());
        for (File file : classPath.listFiles()) {
            if (file.isDirectory()) {
                doScanner(scanPackage + "." + file.getName());
            } else {
                if (!file.getName().endsWith(".class")) {
                    continue;
                }
                String className = (scanPackage + "." + file.getName().replace(".class", ""));
                registyBeanClasses.add(className);
            }
        }
    }


    public List<ZABeanDefinition> loadBeanDefinitions() throws Exception {
        List<ZABeanDefinition> result = new ArrayList<>();
        for (String className : registyBeanClasses) {
            Class<?> beanClass = Class.forName(className);
            if (beanClass.isInterface()) {
                continue;
            }

            ZABeanDefinition zaBeanDefinition = doCreateBeanDefinition(toLowerFirstCase(beanClass.getSimpleName()), beanClass.getName());
            result.add(zaBeanDefinition);
        }

        return result;

    }

    private ZABeanDefinition doCreateBeanDefinition(String factoryBeanName, String beanClassName) {
        ZABeanDefinition beanDefinition = new ZABeanDefinition();
        beanDefinition.setBeanClassName(beanClassName);
        beanDefinition.setFactoryBeanName(factoryBeanName);
        return beanDefinition;
    }

    private String toLowerFirstCase(String simpleName) {
        char[] chars = simpleName.toCharArray();
        //之所以加，是因为大小写字母的ASCII码相差32，
        // 而且大写字母的ASCII码要小于小写字母的ASCII码
        //在Java中，对char做算学运算，实际上就是对ASCII码做算学运算
        chars[0] += 32;
        return String.valueOf(chars);
    }
}
