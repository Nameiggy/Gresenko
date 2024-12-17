package com.example.Igor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Внедрение зависимостей через XML
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Car car = context.getBean("car", Car.class);
//        System.out.println(car);
        // Внедрение зависимостей через XML + Java аннотации
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        System.out.println(car);
    }
}