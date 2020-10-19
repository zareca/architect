package com.zareca.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: ly
 * @Date: 2020/10/16 16:13
 * @Description:
 */
public class JDKMeipo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> cla = target.getClass();
        return Proxy.newProxyInstance(cla.getClassLoader(), cla.getInterfaces(), this);

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        System.out.println("11111"+invoke);
        after();
        return invoke;
    }


    public void before() {
        System.out.println("媒婆准备物色");
    }

    public void after() {
        System.out.println("媒婆准备安排婚事");
    }

}
