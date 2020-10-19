package com.zareca.factory.factorymethod;

import com.zareca.factory.ISeal;
import com.zareca.factory.OvalSeal;

/**
 * @Auther: ly
 * @Date: 2020/10/10 22:26
 * @Description:
 */
public class OvalSealFactory implements ISealFactory {
    public ISeal create() {
        return new OvalSeal();
    }
}
