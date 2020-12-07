package com.zareca.spring.formework.beans.config;

import lombok.Data;

/**
 * @Auther: ly
 * @Date: 2020/12/6 21:41
 * @Description:
 */
@Data
public class ZABeanDefinition {

    private String beanClassName;
    private boolean lazyInit = false;
    private String factoryBeanName;
    private boolean isSingleton = true;
}
