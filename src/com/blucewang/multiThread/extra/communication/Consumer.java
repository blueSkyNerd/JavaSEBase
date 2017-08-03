package com.blucewang.multiThread.extra.communication;

import java.util.concurrent.BlockingQueue;

/**
 * Created by bluceWang on 2017/7/19.
 */
public class Consumer extends Thread{
    private BlockingQueue<String> bq;

    public Consumer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
       while(true){
           System.out.println(getName()+"准备消费数据！");
           try {
               Thread.sleep(200);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           try {
               bq.take();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(getName()+"消费完成！"+bq);
       }
    }
}
