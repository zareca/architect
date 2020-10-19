package com.zareca.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.zareca.observer.Question;

/**
 * @Auther: ly
 * @Date: 2020/10/19 23:16
 * @Description:
 */
public class GuavaTeacher {

    @Subscribe
    public void accept(Question question) {
        System.out.println("来自" + question.getUsername() + "的提问，内容是：" + question.getContent());
    }
}
