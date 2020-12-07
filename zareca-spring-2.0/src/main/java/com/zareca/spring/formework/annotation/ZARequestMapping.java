package com.zareca.spring.formework.annotation;

import java.lang.annotation.*;

/**
 * @Auther: ly
 * @Date: 2020/12/6 20:37
 * @Description:
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ZARequestMapping {
    String value() default "";
}
