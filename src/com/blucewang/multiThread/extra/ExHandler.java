package com.blucewang.multiThread.extra;

/**
 * Created by bluceWang on 2017/6/30.
 */
public class ExHandler {

    public static void main(String[] args) {
        Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
        int sum = 50/0;
        System.out.println("main方法正常结束！");
    }
}

class MyExHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t + " 线程出现异常：" + e);
    }
}
