package com.blucewang.ClassRelate.ClassLoad;

/**
 * Created by bluceWang on 2017/2/28.
 */
public class Hello {
    public static void main(String[] args) {
        for (String arg : args){
            System.out.println("运行hello的参数是："+arg);
            Hello.class.getClassLoader();
        }
    }
}
