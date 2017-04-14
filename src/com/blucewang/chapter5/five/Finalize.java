package com.blucewang.chapter5.five;

/**
 * Created by bluceWang on 2017/2/14.
 */
public class Finalize {

    public static void main(String[] args) {
        new Finalize();
        System.gc();
        System.runFinalization();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize test");
    }
}
