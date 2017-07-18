package com.blucewang.multiThread.extra.control.join;

/**
 * Created by bluceWang on 2017/7/14.
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        ThreadA threadA = new ThreadA();
        threadA.start();
        try {
            threadA.join();
            System.out.println("我是ThreadB,正常结束");
        } catch (InterruptedException e) {
            System.out.println("我是ThreadB，在异常处结束");
            e.printStackTrace();
        }

    }
}
