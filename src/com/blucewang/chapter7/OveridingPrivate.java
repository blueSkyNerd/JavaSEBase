package com.blucewang.chapter7;

/**
 * Created by bluceWang on 2017/2/21.
 */
public class OveridingPrivate extends WithFinals {
//    @Override 添加上overide註解會報錯
    private final void f(){
        System.out.println("OveridingPrivate.f()");
    }

    private void g(){
        System.out.println("OveridingPrivate.g()");
    }
        //会报错，不能重写父类final方法
//    public  void r(){
//        System.out.println("OveridingPrivate.r()");
//    }
}
