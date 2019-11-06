package com.mkozachuk.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
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
    public MusicPlayer(){

    }

    public void playMusicList(){
        for (Music music : musicList){
            System.out.println("Playing: " + music.getSong());
        }

    }
}
