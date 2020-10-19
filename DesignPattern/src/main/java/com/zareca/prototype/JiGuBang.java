package com.zareca.prototype;

import lombok.Data;

/**
 * @Auther: ly
 * @Date: 2020/10/15 11:14
 * @Description:
 */
@Data
public class JiGuBang implements Cloneable{

    private int jlong;

    private int jshort;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
