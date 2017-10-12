package com.blucewang.classRelate.classLoad;

/**
 * Created by bluceWang on 2017/2/28.
 */
public class Hello {
    public static void main(String[] args) {
        for (String arg : args){
            System.out.println("����hello�Ĳ����ǣ�"+arg);
            Hello.class.getClassLoader();
        }
    }
}
