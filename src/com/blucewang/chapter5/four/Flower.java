package com.blucewang.chapter5.four;

/**
 * Created by bluceWang on 2017/2/9.
 */
public class Flower {
    String s = "init value";
    int petalCount=0;

    public Flower(int petalCount) {
        this.petalCount = petalCount;
    }

    public Flower(String s, int petalCount) {
        this.s = s;
        this.petalCount = petalCount;
    }
}
