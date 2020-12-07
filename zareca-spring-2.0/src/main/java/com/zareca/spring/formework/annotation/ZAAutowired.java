package com.zareca.spring.formework.annotation;

import java.lang.annotation.*;

/**
 * @Auther: ly
 * @Date: 2020/12/6 20:35
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ZAAutowired {
    String value() default "";
}
