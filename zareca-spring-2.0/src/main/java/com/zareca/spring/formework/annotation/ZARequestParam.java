package com.zareca.spring.formework.annotation;

import java.lang.annotation.*;

/**
 * @Auther: ly
 * @Date: 2020/12/6 20:38
 * @Description:
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ZARequestParam {
    String value() default "";
}
