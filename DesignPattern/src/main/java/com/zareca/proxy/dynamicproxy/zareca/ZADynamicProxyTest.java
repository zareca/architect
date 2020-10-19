package com.zareca.proxy.dynamicproxy.zareca;

import com.zareca.proxy.dynamicproxy.Gril;
import com.zareca.proxy.dynamicproxy.Person;

/**
 * @Auther: ly
 * @Date: 2020/10/18 13:32
 * @Description:
 */
public class ZADynamicProxyTest {

    public static void main(String[] args) {
        Person person = (Person) new ZAMeipo().getInstance(new Gril());
        System.out.println(person.getClass());
        person.findObject();
    }
}
