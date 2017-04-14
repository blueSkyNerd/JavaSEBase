package com.blucewang.chapter15_generic;

/**
 * Created by bluceWang on 2017/3/29.
 */
public class CountObject {
    private static long count=0;
    private final long id=++count;

    private CountObject(){
        System.out.println("init default");
        System.out.println(id);
    }

    static {
        System.out.println("init static");
    }

    public long id(){
        return id;
    }

    @Override
    public String toString() {
        return "CountObject{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        CountObject countObject = new CountObject();
//        System.out.println(countObject.id);
//        System.out.println(countObject.id);
    }
}
