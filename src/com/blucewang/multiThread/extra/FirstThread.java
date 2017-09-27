package com.blucewang.multiThread.extra;

/**
 * Created by bluceWang on 2017/6/28.
 */
public class FirstThread extends Thread {
    private int i = 2;

    @Override
    public void run() {
        while(i>0){
            i--;
            System.out.println(currentThread().getName()+"计算，结果为:"+i);
            //如果没有以下代码，则只会出现一个线程进行计算，因为在操作系统分配的时间内，第一个线程已经把结果计算出来了
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println("当前线程"+currentThread().getName());
    }

    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        new Thread(thread,"线程1").start();
        new Thread(thread,"线程2").start();
        thread.interrupt();
    }
}
