package com.blucewang.multiThread.extra.synchronize.draw;

import java.math.BigDecimal;
import java.util.BitSet;

/**
 * Created by bluceWang on 2017/7/17.
 */
public class Account {
    private String accoutName;

    private BigDecimal balance;

    public Account(String accoutName, BigDecimal balance) {
        this.accoutName = accoutName;
        this.balance = balance;
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
