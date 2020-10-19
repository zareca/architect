package com.zareca.proxy.dynamicproxy;

/**
 * @Auther: ly
 * @Date: 2020/10/16 16:23
 * @Description:
 */
public class DynamicProxyTest {
    public static void main(String[] args) throws Exception {
        Person obj = (Person) new JDKMeipo().getInstance(new Gril());
        obj.findObject();
//        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
//        FileOutputStream os = new FileOutputStream("D://$Proxy0.class");
//        os.write(bytes);
//        os.close();
    }
}
