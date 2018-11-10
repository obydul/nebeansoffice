package com.obydul.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloConfig {
    @Bean
    public Hello hello(){
        return new Hello();
    }
}
