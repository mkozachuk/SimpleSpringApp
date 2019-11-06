package com.mkozachuk.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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
