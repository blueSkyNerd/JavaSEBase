package com.blucewang.jvm.memoryManager;

/**
 * -Xss128K
 * Created by bluceWang on 2017/10/23.
 */
public class JavaVMSOF {
    private int stackLength=1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMSOF javaVMSOF = new JavaVMSOF();
        try{
            javaVMSOF.stackLeak();
        }catch (Throwable e){
            System.out.println("方法溢出栈长度为："+javaVMSOF.stackLength);
            throw e;
        }
    }
}
