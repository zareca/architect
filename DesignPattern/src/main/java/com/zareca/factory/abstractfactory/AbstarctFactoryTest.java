package com.zareca.factory.abstractfactory;

/**
 * @Auther: ly
 * @Date: 2020/10/10 23:02
 * @Description:
 */
public class AbstarctFactoryTest {
    public static void main(String[] args) {
        ISealsFactory factory = new OvalSealsFactory();
        IColor color = factory.createColor();
        color.red();
        IStar star = factory.createStar();
        star.star();

        factory = new RoundSealsFactory();
        color = factory.createColor();
        color.red();
        star = factory.createStar();
        star.star();

    }
}
