package com.zareca.factory.abstractfactory;

/**
 * @Auther: ly
 * @Date: 2020/10/10 22:59
 * @Description:
 */
public class OvalSealsFactory implements ISealsFactory {
    public IColor createColor() {
        return new OvalColorSeal();
    }

    public IStar createStar() {
        return new OvalStarSeal();
    }
}
