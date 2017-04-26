package com.blucewang.chapter10_innerClass.practice;

/**
 * Created by bluceWang on 2017/4/12.
 */
public class Outer {
    public String outerName;

    class Inner {
        public String innerName;

        Inner(String outer, String inenerName) {
            this.innerName = inenerName;
            outerName = outer;
            System.out.println("inner class name is " + inenerName);
        }
    }

    public Inner getInner(String outer, String innerName) {
        return new Inner(outer, innerName);
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().getInner("innerName", "innerTest");
        System.out.println(inner.innerName);
    }
}
