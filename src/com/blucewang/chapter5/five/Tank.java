package com.blucewang.chapter5.five;

/**
 * Created by bluceWang on 2017/2/14.
 */
public class Tank {
    static int counter;
    int id=counter++;
    boolean full;

    public Tank(){
        System.out.println("Tank "+ id +"created");
        full=true;
    }

    public void empty(){
        full=false;
    }

    @Override
    protected void finalize() throws Throwable {
        if(full){
            System.out.println("Tank "+id+" is full,can't collect");
        }else{
            System.out.println("Tank "+id +" is empty,clean up finished ");
        }
    }
}
