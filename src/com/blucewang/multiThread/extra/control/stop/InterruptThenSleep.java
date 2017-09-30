package com.blucewang.multiThread.extra.control.stop;

/**
 * Created by blucewang on 2017/9/30.
 */
public class InterruptThenSleep extends Thread {
    @Override
    public void run() {
        while (true){
            if(isInterrupted()){
                try {
                    sleep(100);
                    System.out.println("thread end");
                } catch (InterruptedException e) {
                    System.out.println("thread is interrupted then sleep,status :"+this.isInterrupted());
                    e.printStackTrace();
                }finally {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        InterruptThenSleep thread = new InterruptThenSleep();
        thread.start();
        thread.interrupt();
        System.out.println("main end");
    }
}
