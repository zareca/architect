package com.zareca.factory.factorymethod;

import com.zareca.factory.ISeal;
import com.zareca.factory.RoundSeal;

/**
 * @Auther: ly
 * @Date: 2020/10/10 22:27
 * @Description:
 */
public class RoundSealFactory implements ISealFactory {
    public ISeal create() {
        return new RoundSeal();
    }
}
