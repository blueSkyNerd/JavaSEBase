package com.blucewang.chapter10_innerClass.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bluceWang on 2017/4/22.
 */
interface U {
    String u1(String u1);

    static String testStatic(){
        return "test";
    }

    void u2();

    void u3();
}

public class P23 {
    class A {
        U getU() {
            return new U() {
                @Override
                public String u1(String u1) {
                    return "u1";
                }

                @Override
                public void u2() {
                    System.out.println("u2");
                }

                @Override
                public void u3() {
                    System.out.println("u3");
                }
            };
        }
    }

    class B {
        private List<U> uList = new ArrayList<>();

        void addU(U u) {
            uList.add(u);
        }

        void removeU(U u) {
            uList.remove(u);
        }

        void callUMethod(){
            if(!uList.isEmpty()){
                for (U u: uList
                     ) {
                    System.out.println(u.u1("testU1"));
                    u.u2();
                    u.u3();
                }
            }
        }
    }

    public static void main(String[] args) {
        P23 p23 = new P23();
        A a = p23.new A();
        A a2 = p23.new A();
        A a3 = p23.new A();

        B b = p23.new B();
        U u = a.getU();
        U u1 = a2.getU();
        U u2 = a3.getU();
        b.addU(u);
        b.addU(u1);
        b.addU(u2);

        b.callUMethod();
        b.removeU(u);
        b.removeU(u2);
        System.out.println("-------------------");
        b.callUMethod();
    }
}
