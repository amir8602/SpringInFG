package com.amir.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        Student student1 = (Student) applicationContext.getBean("student");
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student==student1);

    }
}
