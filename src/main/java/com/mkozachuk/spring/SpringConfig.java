package com.mkozachuk.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.mkozachuk.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
