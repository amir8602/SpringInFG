package com.amir.spring.core;


import lombok.*;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString

public class Student {
    private String name;
    private String family;
    private Integer age;
    private Book book;


    public void init(){
        System.out.println("init");
    }

    public Integer sum(Integer a , Integer b){
        return a+b;
    }

}
