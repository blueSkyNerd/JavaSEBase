package com.blucewang.chapter10_innerClass.practice;


/**
 * Created by bluceWang on 2017/4/28.
 */
public class P26 {
    class inner2 extends P26_withNoDefault.inner{
//            public inner2(int i){
//                super(i);
//            }

            public inner2(P26_withNoDefault withNoDefault,int i){
                withNoDefault.super(i);
            }
    }
}
