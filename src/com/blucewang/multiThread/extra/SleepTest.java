package com.blucewang.multiThread.extra;

import java.util.Date;

/**
 * Created by bluceWang on 2017/6/29.
 */
public class SleepTest {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            System.out.println("当前时间"+new Date());
            try {
                //主线程休眠一秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
