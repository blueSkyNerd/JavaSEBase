package com.blucewang.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bluceWang on 2017/12/23.
 */
public class TraverseTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10000000);
        for(int i=0;i<10000000;i++){
            list.add("a"+i);
        }

        //使用迭代器遍历
        long startTime = System.currentTimeMillis();
        for (String element:
             list) {
            String e = element;
        }
        System.out.println("迭代器遍历耗时："+(System.currentTimeMillis()-startTime)+"毫秒");

         startTime = System.currentTimeMillis();
        for (int i=0;i<list.size();i++){
            String e = list.get(i);
        }
        System.out.println("循环遍历耗时："+(System.currentTimeMillis()-startTime)+"毫秒");

    }
}

//结果输出：
//迭代器遍历耗时：70毫秒
//循环遍历耗时：58毫秒