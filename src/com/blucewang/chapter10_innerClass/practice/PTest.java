package com.blucewang.chapter10_innerClass.practice;

/**
 * Created by bluceWang on 2017/4/18.
 */
public class PTest {
    public static void main(String[] args) {
        P11 p11 = new P11();
        HelloInterface p111 = p11.getP11Hello("p11");
        //不能向下转型
//        P11Hello p1111 = (P11Hello) p111;
    }
}
