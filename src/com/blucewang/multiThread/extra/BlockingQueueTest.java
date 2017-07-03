package com.blucewang.multiThread.extra;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by bluceWang on 2017/6/29.
 */
public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
        queue.offer("a");
        queue.offer("b");
        System.out.println("continue");
        queue.offer("c");
        System.out.println("blocking");
    }
}
