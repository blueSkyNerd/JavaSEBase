package com.blucewang.multiThread.extra.control.join;

/**
 * Created by bluceWang on 2017/7/14.
 */
public class JoinEffect implements Runnable {

    @Override
    public void run() {
        int random = (int) (Math.random() * 1000);
        System.out.println(Thread.currentThread().getName() + "睡眠时间为" + random + "毫秒");
        try {
            Thread.sleep(random);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new JoinEffect(), "被join的线程");
        thread.start();
        try {
            //如果没有这行代码，则主线程都会先于该子线程结束
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "线程结束");
    }
}
