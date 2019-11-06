package com.mkozachuk.spring;

import java.util.Random;


public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    private Random randomInt = new Random();




    public Computer(MusicPlayer musicPlayer) {
        this.id = randomInt.nextInt(100);
        this.musicPlayer = musicPlayer;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Computer id: " + id +
                "\n" + "Playing random playlist: " + musicPlayer.playMusicList() +
                "\n" + "Using: " + musicPlayer.getPlayerName()+
                "\n" + "Actual volume: " + musicPlayer.getVolume();
    }
}
