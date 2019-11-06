package com.mkozachuk.spring.Geners;

import com.mkozachuk.spring.Music;

import java.util.ArrayList;
import java.util.List;


public class PopMusic implements Music {

    List<String> popMusicPlayList = new ArrayList<>();

    {
        popMusicPlayList.add("Pop Song1");
        popMusicPlayList.add("Pop Song2");
        popMusicPlayList.add("Pop Song3");

    }


    @Override
    public List<String> getSongs() {
        return popMusicPlayList;
    }
}
