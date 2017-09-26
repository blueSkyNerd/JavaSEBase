package com.blucewang.multiThread.extra.communication;

import java.util.concurrent.BlockingQueue;

/**
 * Created by bluceWang on 2017/7/19.
 */
public class Producer extends Thread {
    private BlockingQueue<String> bq;

    public Producer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        String[] strArr = new String[]{
                "java", "spring", "springMvc"
        };

        for (int i = 0; i < 99999; i++) {
            System.out.println(getName()+"准备生产数据！");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                bq.put(strArr[i%3]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+"生产数据完成"+bq);
        }
    }
}
