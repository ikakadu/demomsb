package com.lkl.demomsb.service;

import com.lkl.demomsb.dto.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class ServiceD {


  private final Map<String, Student> map ;

    public Map<String, Student> getMap() {
        return this.map;
    }
}
