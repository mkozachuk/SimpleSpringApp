package com.mkozachuk.spring.Geners;

import com.mkozachuk.spring.Music;

import java.util.ArrayList;
import java.util.List;


public class JazzMusic implements Music {

    List<String> jazzMusicPlayList = new ArrayList<>();

    {
        jazzMusicPlayList.add("Jazz Song1");
        jazzMusicPlayList.add("Jazz Song2");
        jazzMusicPlayList.add("Jazz Song3");

    }

    @Override
    public List<String> getSongs() {
        return jazzMusicPlayList;
    }
}
