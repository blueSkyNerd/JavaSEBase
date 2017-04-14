package com.blucewang.chapter5.five;

/**
 * Created by bluceWang on 2017/2/18.
 */
public class NewVarArgs {
    static void  printArray(Object... args){
        System.out.println(args.length);
        for (Object obj:args){
            System.out.println(obj+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(47),new Float(3.14));
        printArray();
    }
}
