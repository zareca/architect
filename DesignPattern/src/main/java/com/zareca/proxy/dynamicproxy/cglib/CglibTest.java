package com.zareca.proxy.dynamicproxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Auther: ly
 * @Date: 2020/10/18 18:42
 * @Description:
 */
public class CglibTest {
    public static void main(String[] args) {
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D://");
        Customer customer = (Customer) new CglibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}
