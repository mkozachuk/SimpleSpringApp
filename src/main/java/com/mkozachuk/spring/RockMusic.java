package com.mkozachuk.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    List<String> rockMusicPlayList = new ArrayList<>();

    {
        rockMusicPlayList.add("Rock Song1");
        rockMusicPlayList.add("Rock Song1");
        rockMusicPlayList.add("Rock Song3");
    }

    @Override
    public List<String> getSongs() {


        return rockMusicPlayList;
    }
}
