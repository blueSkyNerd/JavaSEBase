package com.blucewang.multiThread.extra.control.stop;

/**
 * Created by blucewang on 2017/9/30.
 */
public class SleepThenInterrupt extends Thread {
    @Override
    public void run() {
        try {
            this.sleep(2000);
            System.out.println("thread end!");
        } catch (InterruptedException e) {
            //if any thread has interrupted the current thread.
            // The interrupted status of the current thread is cleared when this exception is thrown.
            System.out.println("thread sleep first then interrupt it ,status is " + this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SleepThenInterrupt thread = new SleepThenInterrupt();
        thread.start();
        try {
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main exception");
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}
