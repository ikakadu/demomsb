package com.lkl.demomsb.service;

import com.lkl.demomsb.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ServiceD {

    @Autowired
    Map<String, Student> map ;

    public Map<String, Student> getMap() {
        return this.map;
    }
}
