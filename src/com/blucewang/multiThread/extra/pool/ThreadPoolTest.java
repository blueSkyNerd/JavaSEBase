package com.blucewang.multiThread.extra.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by bluceWang on 2017/8/1.
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(6);
        Runnable target = ()->{
          for (int i=1;i<10;i++){
              System.out.println(Thread.currentThread().getName()+"输出的数为："+i);
          }
        };

        executor.submit(target);
        executor.submit(target);
        executor.shutdown();
        executor.submit(target);
    }
}
