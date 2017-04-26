package com.blucewang.chapter10_innerClass.practice;

/**
 * Created by bluceWang on 2017/4/20.
 */
public class P19Test {

    public static void main(String[] args) {
        P19 p19 = new P19();
        P19.P19InerClass inerClass= p19.new P19InerClass("innerName");
        P19.P19InerClass.P19Inner2Class inner2Class = inerClass.new P19Inner2Class("inner2Name");
        System.out.println(inerClass.getInnerName());
        System.out.println(inner2Class.getInner2Name());

        P19_2 p19_2=new P19_2();
        P19_2.P19InerClass p19InerClass = new P19_2.P19InerClass("2_innerName");
        P19_2.P19InerClass.P19Inner2Class p19Inner2Class = new P19_2.P19InerClass.P19Inner2Class("2_inner2Class");

        System.out.println(p19InerClass.getInnerName());
        System.out.println(p19Inner2Class.getInner2Name());
    }
}
