package com.blucewang.multiThread.extra.control.stop;

/**
 * Created by bluceWang on 2017/10/12.
 */
public class InterruptThread extends Thread {
    @Override
    public void run() {
        while(true){
            if (this.isInterrupted()){
                System.out.println("线程状态已变更为结束");
                //可以抛异常进行结束该线程，也可以使用return结束掉
                return;
            }
            System.out.println("线程运行中");
        }
    }

    public static void main(String[] args) {
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        try {
            Thread.sleep(100);
            interruptThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
