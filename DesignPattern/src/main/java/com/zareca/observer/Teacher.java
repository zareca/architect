package com.zareca.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: ly
 * @Date: 2020/10/19 23:06
 * @Description: 观察者
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gper = (GPer) o;
        Question question = (Question) arg;
        System.out.println("==================");
        System.out.println(name + "老师，你好\n" + "你收到了一个来自" + gper.getName() + "的提问，内容\n" + question.getContent() + "\n");
    }
}
