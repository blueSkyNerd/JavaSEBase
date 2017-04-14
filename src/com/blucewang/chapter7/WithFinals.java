package com.blucewang.chapter7;

/**
 * Created by bluceWang on 2017/2/21.
 */
public class WithFinals {
    private final void f(){
        System.out.println("WithFinals.f()");
    }

    private void g(){
        System.out.println("WithFinals.g()");
    }

    public final void r(){
        System.out.println("WithFinals.r()");
    }
}
