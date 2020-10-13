package com.lkl.demomsb.service;

public class MyThread1  extends Thread{
    @Override
    public void run() {
        super.run();
        try{
            System.out.println("run begin");
            for(int i=0;i<500000;i++){
                System.out.println(i);
            }
            System.out.println("方法执行末尾");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("在沉睡中被停止！进入catch！"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}

//情况2：先打断后睡眠，则直接不睡眠：
 class Run1 {
    public static void main(String[] args){
        try{
            MyThread1 thread=new MyThread1();
            thread.start();
            Thread.sleep(1);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}