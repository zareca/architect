package com.zareca.prototype;

import java.util.ArrayList;

/**
 * @Auther: ly
 * @Date: 2020/10/15 11:17
 * @Description:
 */
public class PrototypeTest {
    public static void main(String[] args) throws Exception {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.setName("孙悟空");
        qiTianDaSheng.setHeight(190);
        qiTianDaSheng.setWeight(160);
        ArrayList<String> list = new ArrayList<String>();
        list.add("孙1");
        list.add("孙2");
        qiTianDaSheng.setSon(list);
        JiGuBang jiGuBang = new JiGuBang();
        jiGuBang.setJlong(200);
        jiGuBang.setJshort(100);
        qiTianDaSheng.setJiGuBang(jiGuBang);
        System.out.println(qiTianDaSheng);


        QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
        clone.getJiGuBang().setJshort(300);
        clone.setName("美猴王");
        clone.setHeight(230);
        System.out.println(qiTianDaSheng);
        System.out.println(clone);
        System.out.println(qiTianDaSheng.getName()==clone.getName());
        System.out.println(qiTianDaSheng.getHeight() == qiTianDaSheng.getHeight());
        System.out.println(qiTianDaSheng.getSon() == clone.getSon());
        System.out.println(qiTianDaSheng.getJiGuBang() == clone.getJiGuBang());

    }
}
