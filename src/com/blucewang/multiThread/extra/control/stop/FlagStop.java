package com.blucewang.multiThread.extra.control.stop;

/**
 * Created by bluceWang on 2017/10/12.
 */
public class FlagStop extends Thread {
    private volatile boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println("我在执行");
        }
        System.out.println("执行结束");
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) {
        FlagStop flag = new FlagStop();
        flag.start();
        try {
            Thread.sleep(5);
            flag.setFlag(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
