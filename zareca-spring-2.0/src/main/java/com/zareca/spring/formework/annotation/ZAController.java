package com.zareca.spring.formework.annotation;

import java.lang.annotation.*;

/**
 * @Auther: ly
 * @Date: 2020/12/6 20:36
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ZAController {
    String value() default "";
}
