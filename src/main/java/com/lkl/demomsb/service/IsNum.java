package com.lkl.demomsb.service;
//字母和数字交替打印  两个线程访问的公共资源
public class IsNum {
    boolean flag=true;
    int numberPrint=0;
    int wordPrin=0;
    public IsNum(boolean flag){
        this.flag=flag;
    }
}