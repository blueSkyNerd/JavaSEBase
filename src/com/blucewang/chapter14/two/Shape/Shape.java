package com.blucewang.chapter14.two.Shape;

/**
 * Created by bluceWang on 2017/1/19.
 */
public abstract class Shape {
    void draw(){
        /**
         * this�@�e�������ʲ�N��
         */
        System.out.println(this.toString()+".draw");
    }

    abstract public String toString();

}
