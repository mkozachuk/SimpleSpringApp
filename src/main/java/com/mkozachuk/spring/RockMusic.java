package com.mkozachuk.spring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Smells Like Teen Spirit";
    }
}
