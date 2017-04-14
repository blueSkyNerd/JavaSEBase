package com.blucewang.chapter14.two.Shape;

/**
 * Created by bluceWang on 2017/1/19.
 */
public abstract class Shape {
    void draw(){
        /**
         * this這裡代表的是什麼？
         */
        System.out.println(this.toString()+".draw");
    }

    abstract public String toString();

}
