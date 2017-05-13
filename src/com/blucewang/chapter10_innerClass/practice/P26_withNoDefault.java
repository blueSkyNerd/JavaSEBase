package com.blucewang.chapter10_innerClass.practice;

/**
 * Created by bluceWang on 2017/4/28.
 */
public class P26_withNoDefault {
    class inner {
        int i;

        public inner(int i) {
            this.i = i;
        }

        public inner() {
            i = 47;
        }

        public void f() {
            System.out.println("inner.f()");
        }
    }

}
