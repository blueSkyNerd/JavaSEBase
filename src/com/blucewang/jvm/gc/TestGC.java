package com.blucewang.jvm.gc;

import com.blucewang.chapter10_innerClass.ClassInInterface;

/**
 * Created by bluceWang on 2017/11/6.
 */
public class TestGC {
    public  Object instance;

    private byte[] bigSize = new byte[2*1024*1024];

    public static void testCountGC(){
        TestGC objA = new TestGC();
        TestGC objB = new TestGC();
        objA.instance=objB;
        objB.instance=objA;
        objA=null;
        objB=null;
        System.gc();
    }

    public static void main(String[] args) {
        TestGC.testCountGC();
    }
}
