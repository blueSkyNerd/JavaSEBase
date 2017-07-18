package com.blucewang.multiThread.extra.control;

/**
 * Created by bluceWang on 2017/7/14.
 */
public class YieldTest extends Thread {

    public YieldTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                System.out.println("****************" + getName() + "让出cpu资源*************************");
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        /***
         * 注释掉设置线程等级的代码，则使用yield让线程让出cpu资源后，因为两个线程等级一致，所以另一线程有可能会执行
         */
        for (int i = 1; i < 5; i++) {
            YieldTest yh = new YieldTest("高级");
            yh.setPriority(Thread.MAX_PRIORITY);
            yh.start();
            YieldTest yl = new YieldTest("低级");
            yl.setPriority(Thread.MIN_PRIORITY);
            yl.start();

        }
    }
}
