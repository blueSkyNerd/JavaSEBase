package com.blucewang.multiThread.extra.example;

/**
 * Created by blucewang on 2017/9/27.
 */
class MyThread extends Thread{

    Ticket ticket;                                    //注意，此ticket是一个类，不是int
    public MyThread(Ticket ticket){
        this.ticket=ticket;
    }
    public void run(){
        for(int i=1;i<=100;i++){
            synchronized(ticket){
                if(ticket.num>0)
                    System.out.println("还剩"+(--ticket.num)+"张票");
            }
        }
    }

    public static void main(String[] args){
        Ticket ticket=new Ticket();
        MyThread mt1=new MyThread(ticket);
        MyThread mt2=new MyThread(ticket);
        mt1.start();
        mt2.start();
    }
}

class Ticket{
    int num=100;
}


