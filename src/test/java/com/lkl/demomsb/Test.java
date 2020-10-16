package com.lkl.demomsb;


import com.lkl.demomsb.dto.Student;
import com.lkl.demomsb.dto.StudentA;
import org.apache.commons.collections4.list.TreeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import java.math.BigDecimal;
import java.util.Date;
@SpringBootTest
public class Test {

    @Autowired
    ApplicationContext applicationContext;

    @org.junit.jupiter.api.Test
    public void beanGetTest(){
        String name = applicationContext.getBean("stu1").getClass().getName();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        String[] students = applicationContext.getBeanNamesForType(Student.class);//根据类来获取它在IOC容器里的名字

        System.out.println(name);
    }




    @org.junit.jupiter.api.Test
    public void timeTest(){
//        DateTime parse = DateUtil.parse("20200801 12:10", "yyyyMMdd HH:mm:ss");
//        System.out.println(parse);
//        BigDecimal tempAmount = new BigDecimal("15");
//        int i = tempAmount.compareTo(new BigDecimal("12"));
//        System.out.println(i);

        long l = System.currentTimeMillis() - 1420041600000L << 22 | 0 << 17 | 0 << 12 | 0;
        System.out.println(l);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - 1420041600000L);
        System.out.println(System.currentTimeMillis() - 1420041600000L << 22);
        System.out.println(1 << 17);
        System.out.println(System.currentTimeMillis() - 1420041600000L << 22 | 1 << 17);
        System.out.println(1004 | 2L <<  12);
        System.out.println(1);
        System.out.println(Long.MAX_VALUE);
    }
}
