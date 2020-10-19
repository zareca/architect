package com.zareca.observer;

import org.springframework.web.context.ContextLoaderListener;

/**
 * @Auther: ly
 * @Date: 2020/10/19 23:10
 * @Description:
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher zeraca = new Teacher("Zeraca");
        gper.addObserver(zeraca);

        Question question = new Question();
        question.setUsername("小赵");
        question.setContent("why are you so sb!!");

        gper.publishQuestion(question);
    }
}
