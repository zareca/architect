package com.zareca.observer.guava;

import com.zareca.observer.Question;

/**
 * @Auther: ly
 * @Date: 2020/10/19 23:22
 * @Description:
 */
public class GuavaTest {
    public static void main(String[] args) {
        GuavaGper guavaGper = new GuavaGper(new GuavaTeacher());
        Question question = new Question();
        question.setUsername("小赵");
        question.setContent("why are you so sb!!");
        guavaGper.send(question);
    }
}
