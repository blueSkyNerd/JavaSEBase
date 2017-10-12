package com.blucewang.multiThread.extra.control.stop;

/**
 * Created by bluceWang on 2017/10/12.
 */
public class ThrowException extends Thread {
    @Override
    public void run() {
        try {
             for (int i=0;i<500;i++){
                 if(this.isInterrupted()){
                     System.out.println("线程结束了，使用抛异常的形式停止");
                     throw new InterruptedException("test throw exception");
                 }
             }
            System.out.println("我在while后面");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
