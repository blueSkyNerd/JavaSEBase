package com.blucewang.multiThread.extra.control.join;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by bluceWang on 2017/7/14.
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        System.out.println(getName()+"将会一直执行");
        while (true){
        }
    }
}
