package com.blucewang.multiThread.extra.pool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

/**
 * Created by bluceWang on 2017/8/2.
 */
public class ForkJoinPoolTest extends RecursiveAction {

    private final Integer MAX_LIMIT_NUM = Integer.valueOf(20);

    private Integer start;

    private Integer end;

    public ForkJoinPoolTest(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(new ForkJoinPoolTest(0,200));
        forkJoinPool.awaitTermination(2, TimeUnit.SECONDS);
        forkJoinPool.shutdown();
    }

    @Override
    protected void compute() {
        if (end - start < MAX_LIMIT_NUM) {
            for (int i = start; i < end; i++) {
                System.out.println(Thread.currentThread().getName() + "的值为：" + i);
            }
        }else{
            //当任务之间的差大于中间限定值时，取起始值和结束值的平均值
            Integer middle = (start+end)/2;
            ForkJoinPoolTest splitOne = new ForkJoinPoolTest(start, middle);
            ForkJoinPoolTest splitTwo = new ForkJoinPoolTest(middle, end);
            splitOne.fork();
            splitTwo.fork();
        }
    }
}
