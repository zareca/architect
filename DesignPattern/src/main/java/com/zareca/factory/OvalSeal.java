package com.zareca.factory;

import com.zareca.factory.ISeal;
import lombok.Data;

/**
 * @Auther: ly
 * @Date: 2020/10/10 22:06
 * @Description:
 */
@Data
public class OvalSeal implements ISeal {


    public void makeSeal() {
        System.out.println("椭圆章");
    }
}
