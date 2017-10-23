package com.blucewang.jvm.memoryManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bluceWang on 2017/10/23.
 */
public class RuntimeConstPoolOOM {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        String str="test";
        while (true){
            String base = str+str;
            str=base;
            list.add(base.intern());
        }
    }
}
