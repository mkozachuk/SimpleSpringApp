package com.mkozachuk.spring;

import org.springframework.beans.factory.annotation.Value;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    List<Music > allSongsList = new ArrayList<>();

    @Value("${musicPlayer.playerName}")
    private String playerName;

    @Value("${musicPlayer.volume}")
    private int volume;


    public String getPlayerName() {
        return playerName;
    }


    public int getVolume() {
        return volume;
    }


    public MusicPlayer(List<Music>allSongsList) {
        this.allSongsList = allSongsList;
    }

    public List<String> playMusicList(){
        Random random = new Random();

        return allSongsList.get(random.nextInt(allSongsList.size())).getSongs();

    }
}
