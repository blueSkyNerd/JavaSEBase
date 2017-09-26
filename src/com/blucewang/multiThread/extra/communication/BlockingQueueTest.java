package com.blucewang.multiThread.extra.communication;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by bluceWang on 2017/6/29.
 */
public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        /***
         * 使用
         */
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
//        queue.offer("a");
//        queue.offer("b");
//        System.out.println("continue");
//        queue.offer("c");
//        System.out.println("blocking");

        queue.add("a");
        queue.add("b");
        System.out.println("continue");
        queue.add("c");
        System.out.println("blocking");
    }
}
