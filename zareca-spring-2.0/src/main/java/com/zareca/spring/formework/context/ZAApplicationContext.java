package com.zareca.spring.formework.context;

import com.zareca.spring.formework.beans.config.ZABeanDefinition;
import com.zareca.spring.formework.beans.support.ZABeanDefinitionReader;
import com.zareca.spring.formework.beans.support.ZADefaultListableBeanFactory;
import com.zareca.spring.formework.core.ZABeanFactory;

import java.util.List;
import java.util.Map;

/**
 * @Auther: ly
 * @Date: 2020/12/6 21:16
 * @Description:
 */
public class ZAApplicationContext extends ZADefaultListableBeanFactory implements ZABeanFactory {
    private String[] configLoactions;
    private ZABeanDefinitionReader reader;

    public ZAApplicationContext(String... configLoactions) {
        this.configLoactions = configLoactions;
        try {
            refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void refresh() throws Exception {
        // 1.定位，定位配置文件
        reader = new ZABeanDefinitionReader(this.configLoactions);

        // 2.加载配置文件，扫描相关的类，把它们封装成BeanDefinition
        List<ZABeanDefinition> beanDefinitions =  reader.loadBeanDefinitions();

        // 3.注册，把配置信息放到容器里面
        doRegisterBeanDefinition(beanDefinitions);

        // 4.把不是延迟加载的类提前初始化
        doAutowrited();
    }

    private void doAutowrited() {
        for (Map.Entry<String, ZABeanDefinition> beanDefinitionEntry : super.beanDefinitionMap.entrySet()) {
            String beanName = beanDefinitionEntry.getKey();
            if (!beanDefinitionEntry.getValue().isLazyInit()) {
                getBean(beanName);
            }
        }


    }

    private void doRegisterBeanDefinition(List<ZABeanDefinition> beanDefinitions) throws Exception {

        for (ZABeanDefinition beanDefinition : beanDefinitions) {
            if(super.beanDefinitionMap.containsKey(beanDefinition.getFactoryBeanName())){
                throw new Exception("The “" + beanDefinition.getFactoryBeanName() + "” is exists!!");
            }
            super.beanDefinitionMap.put(beanDefinition.getFactoryBeanName(),beanDefinition);
        }



    }

    @Override
    public Object getBean(String name) throws Exception {
        return null;
    }

    @Override
    public Object getBean(Class<?> requiredType) throws Exception {
        return null;
    }
}
