package com.blucewang.chapter7;

/**
 * Created by bluceWang on 2017/2/21.
 */
public class OveridingPrivate extends WithFinals {
//    @Override �����overide�]������e
    private final void f(){
        System.out.println("OveridingPrivate.f()");
    }

    private void g(){
        System.out.println("OveridingPrivate.g()");
    }
        //�ᱨ��������д����final����
//    public  void r(){
//        System.out.println("OveridingPrivate.r()");
//    }
}
