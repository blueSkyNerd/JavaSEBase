package com.blucewang.chapter10_innerClass.practice;

/**
 * Created by bluceWang on 2017/4/20.
 */
public class P18 {

    private static String p18Name = "p18";

    static class P18NestedClass {
        private static String nestedName;

        P18NestedClass(String name) {
            this.nestedName = name;
        }

        String getParentName() {
            return p18Name;
        }

        String getNestedName() {
            return nestedName;
        }

    }

    public static void main(String[] args) {
        P18NestedClass p18NestedClass = new P18NestedClass("nested Class");
        System.out.println(p18NestedClass.getParentName());
        System.out.println(p18NestedClass.getNestedName());
    }

}
