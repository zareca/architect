package com.zareca.factory.factorymethod;

import com.zareca.factory.ISeal;

/**
 * @Auther: ly
 * @Date: 2020/10/10 22:27
 * @Description:
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ISealFactory factory = new OvalSealFactory();
        ISeal ovalSeal = factory.create();
        ovalSeal.makeSeal();

        factory = new RoundSealFactory();
        ISeal roundSeal = factory.create();
        roundSeal.makeSeal();
    }
}
