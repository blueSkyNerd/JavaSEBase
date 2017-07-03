package com.blucewang.multiThread.extra;

/**
 * Created by bluceWang on 2017/6/28.
 */
public class SecondThread implements Runnable {

    private int i;

    @Override
    public void run() {
        for (; i <= 100; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                SecondThread runnable = new SecondThread();
                new Thread(runnable, "线程1").start();
                new Thread(runnable, "线程2").start();
            }
        }
    }
}
