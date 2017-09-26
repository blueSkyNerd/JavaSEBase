package com.blucewang.multiThread.extra.example;

/**
 * Created by dongdaqing on 2017/9/25.
 */
public class SingleThreadReadFile {
    public static void main(String[] args) {
        for (int i=1;i<100;i++){
            final String    name="线程"+i;
            new Thread(()-> System.out.println("我是线程"+name),name).start();
        }
    }
}
