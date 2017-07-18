package com.blucewang.multiThread.extra.synchronize.draw;

import java.math.BigDecimal;

/**
 * Created by bluceWang on 2017/7/17.
 */
public class DrawThread extends Thread {
    private Account account;

    private BigDecimal drawAmt;

    public DrawThread(String threadName,Account account, BigDecimal drawAmt) {
        super(threadName);
        this.account = account;
        this.drawAmt = drawAmt;
    }

    @Override
    public void run() {

/*        if (account.getBalance().compareTo(drawAmt) > 0) {
            System.out.println(getName()+"取钱成功，取出"+drawAmt+"元");
            account.setBalance(account.getBalance().subtract(drawAmt));
            System.out.println("余额为："+account.getBalance());
        } else {
            System.out.println(account.getAccoutName() + "的账户余额不足！");
        }*/
        /**
         * 把account作为一个同步监视器，任何线程在进入该代码块之前都需要获取到account的锁定，
         * 加锁->修改->释放锁
         */
        synchronized (account){
            if (account.getBalance().compareTo(drawAmt) > 0) {
                System.out.println(getName()+"取钱成功，取出"+drawAmt+"元");
                account.setBalance(account.getBalance().subtract(drawAmt));
                System.out.println("余额为："+account.getBalance());
            } else {
                System.out.println(account.getAccoutName() + "的账户余额不足！");
            }
        }

 /*       if (account.getBalance().compareTo(drawAmt) > 0) {
            System.out.println(getName()+"取钱成功，取出"+drawAmt+"元");
     *//*      try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*//*
            account.setBalance(account.getBalance().subtract(drawAmt));
            System.out.println("余额为："+account.getBalance());
        } else {
            System.out.println(account.getAccoutName() + "的账户余额不足！");
        }*/
    }

    public static void main(String[] args) {
        Account account = new Account("测试账户", BigDecimal.valueOf(1200));
        DrawThread thread = new DrawThread("线程001", account, BigDecimal.valueOf(800));
        thread.start();
        DrawThread thread2 = new DrawThread("线程002", account, BigDecimal.valueOf(800));
        thread2.start();
    }
}
