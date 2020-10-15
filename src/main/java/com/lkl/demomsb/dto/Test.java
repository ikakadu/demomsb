package com.lkl.demomsb.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //测试spring循环依赖
        ApplicationContext context = new ClassPathXmlApplicationContext("application1.xml");

        System.out.println(context.getBean("a", StudentA.class));

    }
}
