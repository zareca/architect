package com.zareca.factory.abstractfactory;

/**
 * @Auther: ly
 * @Date: 2020/10/10 23:00
 * @Description:
 */
public class RoundSealsFactory implements ISealsFactory {
    public IColor createColor() {
        return new RoundColorSeal();
    }

    public IStar createStar() {
        return new RoundStarSeal();
    }
}
