package com.mkozachuk.spring;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "I Don't Care";
    }
}
