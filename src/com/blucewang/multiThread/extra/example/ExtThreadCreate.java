package com.blucewang.multiThread.extra.example;

/**
 * Created by blucewang on 2017/9/27.
 */
public class ExtThreadCreate extends Thread{

    private int i;

    @Override
    public void run() {
        for (;i<=100;i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        ExtThreadCreate thread = new ExtThreadCreate();
        new Thread(thread).start();
        new Thread(thread,"aa").start();
    }
}
