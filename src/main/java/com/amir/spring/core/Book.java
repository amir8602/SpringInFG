package com.amir.spring.core;

import org.springframework.stereotype.Component;

@Component
public interface Book {

    int getPrice();
    String getTitle();


}
