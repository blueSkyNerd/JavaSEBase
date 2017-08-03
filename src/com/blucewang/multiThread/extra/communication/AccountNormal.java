package com.blucewang.multiThread.extra.communication;

import java.math.BigDecimal;

/**
 * Created by bluceWang on 2017/7/19.
 */
public class AccountNormal {

    private String accoutName;

    private BigDecimal balance = BigDecimal.ZERO;

    /**
     * 余额是否足够标记
     */
    private volatile boolean balanceEnoughFlag = false;

    public AccountNormal(String accoutName, BigDecimal balance) {
        this.accoutName = accoutName;
        this.balance = balance;
    }

    public synchronized void draw(BigDecimal drawAmt) {
        //余额不足时，释放当前的同步监视器，该线程进入等待
        if (!balanceEnoughFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance = balance.subtract(drawAmt);
        System.out.println("余额为：" + balance+",钱不够了快来存吧！");
        balanceEnoughFlag = false;
        notifyAll();
    }

    public synchronized void deposit(BigDecimal amt) {
        //余额足够时，释放同步监视器，让线程进入等待
        if (balanceEnoughFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance = balance.add(amt);
        System.out.println("余额为：" + balance+"，钱已经存进去了，快来消费吧！");
        balanceEnoughFlag = true;
        notifyAll();
    }

    public String getAccoutName() {
        return accoutName;
    }

    public void setAccoutName(String accoutName) {
        this.accoutName = accoutName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
