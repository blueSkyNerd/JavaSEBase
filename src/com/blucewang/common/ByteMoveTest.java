package com.blucewang.common;

/**
 * Created by dongdaqing on 2017/9/20.
 */
public class ByteMoveTest {
    public static void main(String[] args) {
        int i =  10;

        printByteInfo(i);
        i=i<<1;
        System.out.println("十位数:"+i);
        printByteInfo(i);
        i=i>>1;
        System.out.println("十位数:"+i);
        printByteInfo(i);
        i=i>>>1;
        System.out.println("十位数:"+i);
        printByteInfo(i);
    }

    private static void printByteInfo(int i) {
        System.out.println(Integer.toBinaryString(i));
    }
}
