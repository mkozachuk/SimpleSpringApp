package com.mkozachuk.spring.Geners;

import com.mkozachuk.spring.Music;
import java.util.ArrayList;
import java.util.List;


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
