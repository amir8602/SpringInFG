package com.amir.spring.context;

import lombok.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Primary
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
