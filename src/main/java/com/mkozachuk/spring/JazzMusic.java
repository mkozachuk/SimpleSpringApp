package com.mkozachuk.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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
