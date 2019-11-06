package com.mkozachuk.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicMusic classicMusic;
    private JazzMusic jazzMusic;
    private PopMusic popMusic;

@Autowired
    public void setMusicList(ClassicMusic classicMusic, RockMusic rockMusic, JazzMusic jazzMusic, PopMusic popMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
        this.popMusic = popMusic;
    }


    private String playerName;
    private int volume;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
//    public MusicPlayer(Music music){
//        this.music = music;
//    }
    public MusicPlayer() {
    }

    public String playMusicList(MusicGenre genre){
        Random random = new Random();
        int randomSong = random.nextInt(3);

        if(genre.equals(MusicGenre.CLASSIC)){
           return classicMusic.getSongs().get(randomSong);
        }else if(genre.equals(MusicGenre.ROCK)){
            return rockMusic.getSongs().get(randomSong);
        }else if(genre.equals(MusicGenre.JAZZ)){
            return jazzMusic.getSongs().get(randomSong);
        }else {
            return popMusic.getSongs().get(randomSong);
        }

    }
}
