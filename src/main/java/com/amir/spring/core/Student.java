package com.amir.spring.core;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
@Component
//@PropertySource("classpath:foo.properties")
@Lazy
public class Student {
   // @Value("${candid}")
    @Value("ali")
    private String name;
    private String family;
    private Integer age;
    @Autowired
//    @Qualifier("${candid}")
    private Book book;


    public void init(){
        System.out.println("init");
    }

    public Integer sum(Integer a , Integer b){
        return a+b;
    }

}
