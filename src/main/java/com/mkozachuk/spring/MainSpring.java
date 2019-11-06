package com.mkozachuk.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
