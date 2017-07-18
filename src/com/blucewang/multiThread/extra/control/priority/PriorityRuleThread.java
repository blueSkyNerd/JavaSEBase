package com.blucewang.multiThread.extra.control.priority;

/**
 * Created by bluceWang on 2017/7/17.
 */
public class PriorityRuleThread extends Thread{
    public PriorityRuleThread(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i=0;i<=5000;i++){
            double result = Math.random() * 1000;
        }
        System.out.println(getName()+"执行完成，执行用时："+(System.currentTimeMillis()-start)+"毫秒");
    }


    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            PriorityRuleThread th = new PriorityRuleThread("高级" + i);
//            th.setPriority(Thread.MAX_PRIORITY);
            th.setPriority(6);
            th.start();
            PriorityRuleThread tl = new PriorityRuleThread("低级" + i);
//            tl.setPriority(Thread.MIN_PRIORITY);
            th.setPriority(5);
            tl.start();
        }
    }
}
