package com.blucewang.multiThread.extra.synchronize.deadLock;

/**
 * Created by bluceWang on 2017/7/18.
 */
class ResourceA {
    public synchronized void getResourceBName(ResourceB b) {
        System.out.println(Thread.currentThread().getName() + "线程进入ResourceA中的getResourceBName方法");
        try {
            Thread.sleep(200);//2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "线程准备调用ResourceB方法来获取B中的名称");//4
        b.printName();
    }

    public synchronized void printName() {
        System.out.println("我是resourceA！");
    }
}

class ResourceB {
    public synchronized void printName() {
        System.out.println("我是resourceB！");
    }

    public synchronized void getResourceAName(ResourceA a) {
        System.out.println(Thread.currentThread().getName() + "线程进入ResourceB中的getResourceAName方法");
        try {
            Thread.sleep(200);//3
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "线程准备调用ResourceA方法来获取A中的名称");//5
        a.printName();
    }
}

public class DeadLock implements Runnable{
    private ResourceA a = new ResourceA();
    private ResourceB b = new ResourceB();

    @Override
    public void run() {
        a.getResourceBName(b);
    }

    public void initB(){
        b.getResourceAName(a);
    }

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        new Thread(deadLock,"死锁测试线程").start();//1
        deadLock.initB();
    }
}
