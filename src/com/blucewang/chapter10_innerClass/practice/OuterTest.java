package com.blucewang.chapter10_innerClass.practice;

/**
 * Created by bluceWang on 2017/4/15.
 */
public class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        /**
         * 内部类需要这么声明，原因是内部类有使用到外部类的引用
         */
        Outer.Inner inner = outer.new Inner("outerName1","innerName1");
        System.out.println(outer.outerName);
        System.out.println(inner.innerName);
    }
}
