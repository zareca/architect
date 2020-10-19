package com.zareca.prototype;

import lombok.Data;

import java.util.ArrayList;

/**
 * @Auther: ly
 * @Date: 2020/10/15 11:13
 * @Description:
 */
@Data
public class QiTianDaSheng implements Cloneable {

    private String name;

    private Integer height;

    private Integer weight;

    private ArrayList<String> son;

    private JiGuBang jiGuBang;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 该步只克隆基本数据类型
        QiTianDaSheng qiTianDaSheng = (QiTianDaSheng) super.clone();
        // 调用该引用类型中的clone方法克隆出一个新的对象并赋值给新克隆出来的类
        qiTianDaSheng.jiGuBang = (JiGuBang) this.jiGuBang.clone();
        return qiTianDaSheng;

          // 浅拷贝
//        return super.clone();

    }
}
