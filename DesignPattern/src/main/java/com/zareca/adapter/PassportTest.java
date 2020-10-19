package com.zareca.adapter;

/**
 * @Auther: ly
 * @Date: 2020/10/18 23:06
 * @Description:
 */
public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportThirdAdapter();
        adapter.loginForQQ("");
    }
}
