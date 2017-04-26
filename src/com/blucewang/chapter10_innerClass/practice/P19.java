package com.blucewang.chapter10_innerClass.practice;

/**
 * Created by bluceWang on 2017/4/20.
 */
public class P19 {
    private String p19Name="p19";

    class P19InerClass{
        private String innerName;
        P19InerClass(String name){
            this.innerName=name;
        }

        String getInnerName(){
            return innerName;
        }
        class P19Inner2Class{
            private String inner2Name;
            P19Inner2Class(String name){
                this.inner2Name=name;
            }
            String getInner2Name(){
                return  inner2Name;
            }
        }
    }
}
