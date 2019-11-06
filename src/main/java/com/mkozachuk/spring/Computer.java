package com.mkozachuk.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    private Random randomInt = new Random();

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = randomInt.nextInt(100);
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer id: " + id +
                "\n" + "Today's Playlist: " + musicPlayer.playMusicList();
    }
}
