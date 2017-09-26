package com.blucewang.multiThread.extra.communication;

import java.math.BigDecimal;

/**
 * Created by bluceWang on 2017/7/19.
 */
public class AccountTest {
    public static void main(String[] args) {
        AccountNormal wangyb = new AccountNormal("wangyb", BigDecimal.ZERO);
        AccountLock wybLock = new AccountLock("wybLock",BigDecimal.ZERO);
//        new Thread(new DrawThread(wangyb, new BigDecimal(200)), "生产者").start();
//        new Thread(new DepositThread(wangyb, new BigDecimal(200)), "消费者").start();

        new Thread(new DrawThread(wybLock, new BigDecimal(200)), "生产者").start();
        new Thread(new DepositThread(wybLock, new BigDecimal(200)), "消费者").start();


    }
}
