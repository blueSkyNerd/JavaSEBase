package com.blucewang.multiThread.extra.synchronize.draw;

import java.math.BigDecimal;

/**
 * Created by bluceWang on 2017/7/18.
 */
public class AccountSync {
    private String accoutName;

    private BigDecimal balance;

    public AccountSync(String accoutName, BigDecimal balance) {
        this.accoutName = accoutName;
        this.balance = balance;
    }

    public  synchronized void draw(BigDecimal drawAmt){
        if (balance.compareTo(drawAmt) > 0) {
            System.out.println(Thread.currentThread().getName()+"取钱成功，取出"+drawAmt+"元");
            this.setBalance(balance.subtract(drawAmt));
            System.out.println("余额为："+balance);
        } else {
            System.out.println(accoutName + "的账户余额不足！");
        }
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

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
