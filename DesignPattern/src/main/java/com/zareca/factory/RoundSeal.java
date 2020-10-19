package com.zareca.factory;

import com.zareca.factory.ISeal;
import lombok.Data;

/**
 * @Auther: ly
 * @Date: 2020/10/10 22:07
 * @Description:
 */
@Data
public class RoundSeal implements ISeal {


    public void makeSeal() {
        System.out.println("圆章");
    }
}
