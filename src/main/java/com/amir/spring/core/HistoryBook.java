package com.amir.spring.core;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HistoryBook implements Book{
    private int price;
    private String title;

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
