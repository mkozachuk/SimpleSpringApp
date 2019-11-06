package com.mkozachuk.spring;

import com.mkozachuk.spring.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
