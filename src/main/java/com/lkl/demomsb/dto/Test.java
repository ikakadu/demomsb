package com.lkl.demomsb.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        System.out.println(context.getBean("a", StudentA.class));

    }
}
