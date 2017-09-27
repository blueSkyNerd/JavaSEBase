package com.blucewang.multiThread.extra.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by blucewang on 2017/9/27.
 */
public class CallableCreate {
    public static void main(String[] args) {
        //创建Callable对象
        FutureTask<Integer> futureTask = new FutureTask<Integer>((Callable<Integer>) () -> {
            int i = 1;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "的循环变量i值为 " + i);
            }
            return i;
        });
        for (int i = 1; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "的循环变量i值为:" + i);
            if (i == 20) {
                new Thread(futureTask, "callable线程").start();
                try {
                    //get()方法将导致main方法阻塞，直到值返回为止
                    System.out.println("获取当前线程的返回值为" + futureTask.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
