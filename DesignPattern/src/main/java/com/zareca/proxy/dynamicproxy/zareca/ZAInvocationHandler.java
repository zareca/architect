package com.zareca.proxy.dynamicproxy.zareca;

import java.lang.reflect.Method;

/**
 * @Auther: ly
 * @Date: 2020/10/18 12:58
 * @Description:
 */
public interface ZAInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;

}
