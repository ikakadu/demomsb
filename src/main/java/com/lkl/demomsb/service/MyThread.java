package com.lkl.demomsb.service;

public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try{
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("在沉睡中被停止！进入catch！"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}

//情况1：先睡眠后打断，则直接打断睡眠，并且清除停止状态值，使之变成false：
class Run {
    public static void main(String[] args){
        try{
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}