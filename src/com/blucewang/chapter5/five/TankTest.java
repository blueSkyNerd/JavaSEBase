package com.blucewang.chapter5.five;

/**
 * Created by bluceWang on 2017/2/14.
 */
public class TankTest {
    public static void main(String[] args) {
        new Tank();
        new Tank().empty();
        System.gc();
        System.runFinalization();
    }
}
