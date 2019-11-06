package com.mkozachuk.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println("Player name: " + musicPlayer.getPlayerName());
        System.out.println("Volume: " + musicPlayer.getVolume());

        context.close();
    }
}
