package com.mkozachuk.spring.config;

import com.mkozachuk.spring.*;
import com.mkozachuk.spring.Geners.ClassicMusic;
import com.mkozachuk.spring.Geners.JazzMusic;
import com.mkozachuk.spring.Geners.PopMusic;
import com.mkozachuk.spring.Geners.RockMusic;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(allSongsList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

    @Bean
    List<Music> allSongsList(){
        return Arrays.asList(rockMusic(), classicMusic(), jazzMusic(), popMusic());
    }


}
