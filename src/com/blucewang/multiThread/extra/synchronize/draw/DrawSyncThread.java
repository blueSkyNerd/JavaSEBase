package com.blucewang.multiThread.extra.synchronize.draw;

import java.math.BigDecimal;

/**
 * Created by bluceWang on 2017/7/18.
 */
public class DrawSyncThread extends Thread {
    private AccountSync account;

    private BigDecimal drawAmt;

    public DrawSyncThread(String threadName, AccountSync account, BigDecimal drawAmt) {
        super(threadName);
        this.account = account;
        this.drawAmt = drawAmt;
    }

    @Override
    public void run(){
        account.draw(drawAmt);
    }

    public static void main(String[] args) {
        AccountSync account = new AccountSync("测试账户", BigDecimal.valueOf(1200));
        DrawSyncThread thread = new DrawSyncThread("线程001", account, BigDecimal.valueOf(800));
        thread.start();
        DrawSyncThread thread2 = new DrawSyncThread("线程002", account, BigDecimal.valueOf(800));
        thread2.start();
    }
}
