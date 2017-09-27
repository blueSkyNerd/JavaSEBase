package com.blucewang.multiThread.extra.example;

/**
 * Created by dongdaqing on 2017/9/27.
 */
public class RunnableCreate implements Runnable {
    private Integer i = 0;

    @Override
    public void run() {
        for (; i <= 100; i++) {
            //使用实现Runnable接口的方法，不能直接使用getName的方式进行获取线程名称
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        RunnableCreate target = new RunnableCreate();
        new Thread(target).start();
        new Thread(target).start();
    }

}
