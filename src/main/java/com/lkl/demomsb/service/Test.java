package com.lkl.demomsb.service;

public class Test {
    public static void main(String[] args) {
        IsNum isNum=new IsNum(false);
        new PrintWord("打印字母",isNum).start();
        new PrintNumber("打印数字",isNum).start();
    }
}
