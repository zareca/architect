package com.zareca.spring.formework.beans.support;

import com.zareca.spring.formework.beans.config.ZABeanDefinition;
import com.zareca.spring.formework.context.support.ZAAbstractApplicationContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: ly
 * @Date: 2020/12/6 21:19
 * @Description:
 */
public class ZADefaultListableBeanFactory extends ZAAbstractApplicationContext {

    //存储注册信息的BeanDefinition,伪IOC容器
    protected final Map<String, ZABeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
}
