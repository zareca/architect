package com.zareca.spring.formework.core;

/**
 * @Auther: ly
 * @Date: 2020/12/6 20:40
 * @Description:
 */
public interface ZABeanFactory {

    Object getBean(String name) throws Exception;

    Object getBean(Class<?> requiredType) throws Exception;
}
