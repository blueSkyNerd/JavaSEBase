package com.blucewang.multiThread.extra.pool;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.*;

/**
 * 数组的值累加计算输出
 * Created by bluceWang on 2017/8/4.
 */
public class CallBackTask extends RecursiveTask<Integer> {

    private final Integer THREAD_HOLD_NUM = 30;

    private Integer start;

    private Integer end;

    private Integer[] arr;

    public CallBackTask(Integer[] arr, Integer start, Integer end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {
        if(end-start<THREAD_HOLD_NUM){
            Integer sum=0;
            for(int i=start;i<end;i++){
                sum+=arr[i];
            }
            return sum;
        }else{
            int middle = (end - start) / 2;
            CallBackTask forkOne = new CallBackTask(arr, start, middle);
            CallBackTask forkTwo = new CallBackTask(arr, middle, end);
            forkOne.fork();
            forkTwo.fork();
            return forkOne.join()+forkTwo.join();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer[] arr = new Integer[300];
        Random random = new Random();
        Integer total = 0;
        for (int i=0;i<arr.length;i++){
            total+=(arr[i]=random.nextInt(20));
        }
        System.out.println(total);
        CallBackTask backTask = new CallBackTask(arr, 0, arr.length);
        //创建一个通用池
        ForkJoinPool joinPool = ForkJoinPool.commonPool();
        Future<Integer> future = joinPool.submit(backTask);
        System.out.println(future.get());
    }
}
