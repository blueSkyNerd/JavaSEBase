package com.blucewang.chapter10_innerClass.practice;

/**
 * Created by bluceWang on 2017/4/18.
 */

public class P11 {
    private class  P11Hello implements HelloInterface{
        private String name;

        public P11Hello(String name) {
            this.name = name;
        }

        @Override
        public void sayHello() {
            if (name==null){
                name="P11Hello";
            }
            System.out.println(name+"say hello");
        }
    }

    public HelloInterface getP11Hello(String name){
        return new P11Hello(name);
    }


}
