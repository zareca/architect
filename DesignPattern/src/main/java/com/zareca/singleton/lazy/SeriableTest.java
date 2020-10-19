package com.zareca.singleton.lazy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Auther: ly
 * @Date: 2020/10/12 23:55
 * @Description:
 */
public class SeriableTest {

    public static void main(String[] args) throws Exception {

        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = new FileOutputStream("SeriableSingleton.txt");
        ObjectOutputStream oss = new ObjectOutputStream(fos);
        oss.writeObject(s2);
        oss.flush();
        oss.close();

        FileInputStream fis = new FileInputStream("SeriableSingleton.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SeriableSingleton s1 = (SeriableSingleton) ois.readObject();
        ois.close();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
