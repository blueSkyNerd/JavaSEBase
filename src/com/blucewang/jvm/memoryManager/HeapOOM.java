package com.blucewang.jvm.memoryManager;

import java.util.ArrayList;

/**
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * Created by bluceWang on 2017/10/23.
 */
public class HeapOOM {
    static void oomObj(){

    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<HeapOOM> heapOOMs = new ArrayList<>();
        while(true){
            heapOOMs.add(new HeapOOM());
        }
    }

}
