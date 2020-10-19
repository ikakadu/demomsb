package com.lkl.demomsb.service;

public class PrintWord extends  Thread{

    private IsNum isNum;
    public PrintWord(String name,IsNum isnum){
        super(name);
        this.isNum=isnum;
    }
    @Override
    public void run(){
       while(isNum.numberPrint<5){
            synchronized (isNum) {
                if(!isNum.flag) {
                    System.out.println((char) (97 + isNum.wordPrin));
                    isNum.wordPrin++;
                    if (isNum.wordPrin == 26) {
                        isNum.wordPrin = 0;
                    }
                    isNum.flag=true;
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