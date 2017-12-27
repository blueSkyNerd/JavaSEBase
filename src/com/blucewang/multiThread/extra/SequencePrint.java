package com.blucewang.multiThread.extra;

/**
 * Created by bluceWang on 2017/12/27.
 */
public class SequencePrint implements Runnable {
    private volatile int id;


    private Object obj;

    public SequencePrint(int id, Object obj) {
        this.id = id;
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) {
            System.out.println(id);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        for (int i = 0; i <= 20; i++) {
            Thread thread = new Thread(new SequencePrint(i, lock));
            thread.start();
        }
        Thread.sleep(500000);
    }
}
