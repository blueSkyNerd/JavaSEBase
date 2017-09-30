package com.blucewang.multiThread.extra.control.join;

/**
 * Created by bluceWang on 2017/7/14.
 */
public class ThreadC extends Thread{

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
        while (true){
            if(this.isInterrupted()){
                System.out.println("C is interrupted");
                break;
            }
        }
        System.out.println("c end");
    }
}
