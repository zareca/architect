package com.zareca.factory.simplefactory;

import com.zareca.factory.ISeal;
import com.zareca.factory.OvalSeal;
import com.zareca.factory.RoundSeal;

/**
 * @Auther: ly
 * @Date: 2020/10/10 22:01
 * @Description:
 */
public class SimpleFactoryTest {

    public static void main(String[] args) throws Exception {
        SealFactory sealFactory = new SealFactory();
        ISeal ovalSeal = sealFactory.createSeal(OvalSeal.class);
        ovalSeal.makeSeal();
        ISeal roundSeal = sealFactory.createSeal(RoundSeal.class);
        roundSeal.makeSeal();
    }
}
