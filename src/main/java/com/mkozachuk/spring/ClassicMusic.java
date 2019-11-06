package com.mkozachuk.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music {

    List<String> classicMusicPlayList = new ArrayList<>();

    {
      classicMusicPlayList.add("Classic Song1");
      classicMusicPlayList.add("Classic Song2");
      classicMusicPlayList.add("Classic Song3");

    }

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
    public List<String> getSongs() {
        return classicMusicPlayList;
    }
}
