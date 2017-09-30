package com.blucewang.multiThread.extra.control.join;

/**
 * join()方法与interrupt()方法结合使用，抛异常
 * Created by bluceWang on 2017/7/14.
 */
public class JoinException {
    public static void main(String[] args) {
        /***
         * ThreadB 中被join进了ThreadA,ThreadA一直执行，到ThreadC时，尝试停止ThreadB
         * 此时会抛异常。
         */
        ThreadB threadB = new ThreadB();
        threadB.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadC threadC = new ThreadC(threadB);
        threadC.start();
        threadC.interrupt();
    }
}
