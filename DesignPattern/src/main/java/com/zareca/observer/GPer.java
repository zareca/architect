package com.zareca.observer;

import java.util.Observable;

/**
 * @Auther: ly
 * @Date: 2020/10/19 23:01
 * @Description: 被观察者
 */
public class GPer extends Observable {

    private String name = "Gper生态圈";

    private static GPer gper = null;

    public static GPer getInstance() {
        if (null == gper) {
            gper = new GPer();
        }

        return gper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUsername() + "在" + this.name + "上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
