package com.zareca.proxy.dynamicproxy.cert;

import com.zareca.proxy.staticproxy.DataSource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: ly
 * @Date: 2020/10/18 12:33
 * @Description:
 */
public class CertServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);


    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        Date date = (Date) target.getClass().getMethod("getDateTime").invoke(target);
        Integer dbRouter = Integer.valueOf(yearFormat.format(date));
        DataSource.set(dbRouter);
        System.out.println("使用数据源" + DataSource.get() + "进行调用");
        Object obj = method.invoke(target, args);
        after();
        return obj;
    }


    public void before() {
        System.out.println("对CertServiceImpl进行增强--前置增强");
    }

    public void after() {
        System.out.println("对CertServiceImpl进行增强--后置增强");
    }
}
