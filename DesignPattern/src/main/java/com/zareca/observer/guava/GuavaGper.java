package com.zareca.observer.guava;

import com.google.common.eventbus.EventBus;
import com.zareca.observer.Question;

/**
 * @Auther: ly
 * @Date: 2020/10/19 23:16
 * @Description:
 */
public class GuavaGper {

    private GuavaTeacher guavaTeacher;

    public GuavaGper(GuavaTeacher guavaTeacher) {
        this.guavaTeacher = guavaTeacher;
    }

    public void send(Question question) {
        EventBus eventBus = new EventBus();
        eventBus.register(this.guavaTeacher);
        eventBus.post(question);
    }
}
