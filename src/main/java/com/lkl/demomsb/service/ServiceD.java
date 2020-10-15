package com.lkl.demomsb.service;

import com.lkl.demomsb.dto.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class ServiceD {

    @Bean("stu1")
    @Qualifier("valid")
    Student user1() {
        return new Student(1, "a");
    }

/*    @Bean("stu2")
//    @Qualifier("valid")
    Student user2() {
        return new Student(2, "b");
    }

    @Autowired
    Map<String, Student> map;

    public Map<String, Student> getMap() {
        return this.map;
    }*/
}
