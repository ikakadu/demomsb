package com.lkl.demomsb.service;

public class PrintNumber extends Thread {
    private IsNum isNum;
    public PrintNumber(String name, IsNum isnum){
        super(name);
        this.isNum=isnum;
    }
    @Override
    public void run(){
        while(isNum.numberPrint<5){
            synchronized (isNum){
                if(isNum.flag) {
                    System.out.println(isNum.numberPrint);
                    isNum.numberPrint++;
                    isNum.flag=false;
                    isNum.notifyAll();
                }else{
                    try{
                        isNum.wait();
                    }catch (InterruptedException e){
                        new RuntimeException(e);

                    }
                }
            }
        }

    }
}