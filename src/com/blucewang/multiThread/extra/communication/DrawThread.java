package com.blucewang.multiThread.extra.communication;

import java.math.BigDecimal;

/**
 * Created by bluceWang on 2017/7/19.
 */
public class DrawThread implements Runnable {
    private AccountNormal account;

    private AccountLock accountLock;

    private BigDecimal drawAmt;

    public DrawThread(AccountNormal account, BigDecimal drawAmt) {
        this.account=account;
        this.drawAmt=drawAmt;
    }

    public DrawThread(AccountLock accountLock, BigDecimal drawAmt) {
        this.accountLock=accountLock;
        this.drawAmt=drawAmt;
    }



    @Override
    public void run() {
        for (int i=0;i<100;i++){
            //使用synchronized关键字来加锁，使用Object中的wait()和notifyAll()方法来进行线程通信
//            account.draw(drawAmt);
            //使用Lock显式锁，并使用Condition中的await()和sinalAll()来进行线程通信
            accountLock.draw(drawAmt);
        }
    }
}
