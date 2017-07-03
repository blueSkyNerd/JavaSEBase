package com.blucewang.multiThread.extra;

/**
 * Created by bluceWang on 2017/6/28.
 */
public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (;i<=100;i++){
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i=1;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if (i==20){
                new FirstThread().start();
                new FirstThread().start();
            }
        }
    }
}
