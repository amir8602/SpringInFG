package com.amir.spring.core;

import org.springframework.stereotype.Component;

@Component
public class SportBook implements Book{

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
