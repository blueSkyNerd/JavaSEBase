package com.blucewang.multiThread.extra.control.sleep;

import java.util.Date;

/**
 * Created by bluceWang on 2017/7/14.
 */
public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++){
            System.out.println("当前时间: "+new Date());
            Thread.sleep(1000);
        }
    }
}
