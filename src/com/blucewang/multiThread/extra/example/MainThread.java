package com.blucewang.multiThread.extra.example;

/**
 * Created by dongdaqing on 2017/9/27.
 */
public class MainThread {
    public static void main(String[] args) {
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test thread1");
        },"测试线程").start();
        int i =1/0;
    }

}
