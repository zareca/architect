package com.zareca.factory.simplefactory;

import com.zareca.factory.ISeal;

/**
 * @Auther: ly
 * @Date: 2020/10/10 21:59
 * @Description:
 */
public class SealFactory {

    public ISeal createSeal(Class<? extends ISeal> clazz) throws Exception {
       return clazz.newInstance();
    }

}
