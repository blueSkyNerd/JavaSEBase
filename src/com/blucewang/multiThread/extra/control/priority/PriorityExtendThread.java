package com.blucewang.multiThread.extra.control.priority;

/**
 * Created by bluceWang on 2017/7/17.
 */
public class PriorityExtendThread extends Thread{
    @Override
    public void run() {
        System.out.println("当前线程"+getName()+"的优先级别为:"+getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"线程开始时优先级别为"+Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getName()+"线程结束时优先级别为"+Thread.currentThread().getPriority());
        PriorityExtendThread thread = new PriorityExtendThread();
        thread.start();
    }
}
