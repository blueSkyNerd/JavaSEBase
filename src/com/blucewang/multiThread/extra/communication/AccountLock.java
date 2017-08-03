package com.blucewang.multiThread.extra.communication;

import java.math.BigDecimal;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by bluceWang on 2017/7/20.
 */
public class AccountLock {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    private String accoutName;

    private BigDecimal balance = BigDecimal.ZERO;

    /**
     * 余额是否足够标记
     */
    private volatile boolean balanceEnoughFlag = false;

    public AccountLock(String accoutName, BigDecimal balance) {
        this.accoutName = accoutName;
        this.balance = balance;
    }

    public void draw(BigDecimal drawAmt) {
        lock.lock();//显示使用锁
        try {
            //余额不足时，释放当前的同步监视器，该线程进入等待
            if (!balanceEnoughFlag) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            balance = balance.subtract(drawAmt);
            System.out.println("余额为：" + balance + ",钱不够了快来存吧！");
            balanceEnoughFlag = false;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//抛异常强制解锁
        }
    }

    public void deposit(BigDecimal amt) {
        lock.lock();
        try {
            //余额足够时，释放同步监视器，让线程进入等待
            if (balanceEnoughFlag) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            balance = balance.add(amt);
            System.out.println("余额为：" + balance + "，钱已经存进去了，快来消费吧！");
            balanceEnoughFlag = true;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
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
}
