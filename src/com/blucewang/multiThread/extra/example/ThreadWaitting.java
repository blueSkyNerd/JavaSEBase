package com.blucewang.multiThread.extra.example;

/**
 * Created by dongdaqing on 2017/9/26.
 */
public class ThreadWaitting {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            final String name="线程"+i;
            new Thread(()->{
                System.out.println(name+"开始等待");
                try {
                    Thread.sleep(50000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },name).start();
        }
    }
}
