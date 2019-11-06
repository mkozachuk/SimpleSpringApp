package com.mkozachuk.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicMusic implements Music {

    private ClassicMusic(){

    }

    public static ClassicMusic factoryMethod(){
        return new ClassicMusic();
    }

@PostConstruct
    public void initMethod(){
        System.out.println("Initialization in \"ClassicMusic\"");
    }
@PreDestroy
    public void destroyMethod(){
        System.out.println("Destruction in \"ClassicMusic\"");
    }

    @Override
    public String getSong() {
        return "Symphony No.5";
    }
}
