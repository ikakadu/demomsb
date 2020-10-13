package com.lkl.demomsb.controller;

import com.lkl.demomsb.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyController {

    @Autowired(required = false)
    @Qualifier("valid")
    private List<Student> users = Collections.emptyList();

    @Autowired(required = false)
    @Qualifier("valid")
    private Map<String, Student> userMap = new HashMap<>();

    @RequestMapping("/list")
    public Object listUsers() {
        System.out.println("listStus方法进入");
        return users;
    }

    @RequestMapping("/map")
    public Object mapUsers() {
        System.out.println("mapStus方法进入");
        return userMap;
    }
}