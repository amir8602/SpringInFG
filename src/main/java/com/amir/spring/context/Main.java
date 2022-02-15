package com.amir.spring.context;

import org.apache.log4j.Logger;

public class Main {
    Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
    //        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = (Student) applicationContext.getBean("student");
//        Student student1 = (Student) applicationContext.getBean("student");
//        System.out.println(student);
//        System.out.println(student1);
//        System.out.println(student==student1);
        Main main = new Main();
        main.f();

    }
    public  void f(){
        int i = 17;
        logger.info(String.format("This is in f method and value of i is %d" , i));
    }
}
