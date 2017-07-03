package com.blucewang.multiThread.extra;

/**
 * Created by bluceWang on 2017/6/29.
 */
public class DaemonThread extends Thread {

    @Override
    public void run() {
        for (int i=1;i<1000;i++){
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        //必须在start()之前，否则会抛异常
        daemonThread.setDaemon(true);
        daemonThread.setName("守护线程");
        //守护线程不会跑完，因为唯一的前台主线程会先于守护线程结束，jvm会主动退出
        daemonThread.start();

        for (int i=1;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"主线程值为："+i);
        }
    }
}
