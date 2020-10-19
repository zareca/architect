package com.zareca.proxy.dynamicproxy.zareca;

import java.lang.reflect.Method;

/**
 * @Auther: ly
 * @Date: 2020/10/18 12:58
 * @Description:
 */
public class ZAMeipo implements ZAInvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return ZAProxy.newProxyInstance(new ZAClassLoader(), clazz.getInterfaces(), this);

    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        System.out.println("11111" + invoke);
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
