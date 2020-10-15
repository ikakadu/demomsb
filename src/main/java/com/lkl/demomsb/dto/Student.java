package com.lkl.demomsb.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description:
 * @Author: wangruitao
 * @DATE: 2020/3/31
 **/
//@Data
//@Component
public class Student {
    Integer id;
    String name;
    Date birthday;

    public Student() {
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
