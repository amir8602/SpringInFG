package com.amir.spring.context;


import lombok.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
@Component
//@PropertySource("classpath:foo.properties")
@Lazy
public class Student {
    @Autowired
    private Logger logger;
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
