package com.blucewang.chapter15_generic;

import com.blucewang.chapter15_generic.coffee.Coffee;

import java.util.List;
import java.util.Map;

/**
 * Created by bluceWang on 2017/3/29.
 */
public class LimitOfInference {
    public static void  f(Map<Coffee,List<? extends Coffee>> map){
        System.out.println(map.getClass().getName());
    }

    public static void main(String[] args) {
            //不能进行类型判断，编译器认为:调用泛型方法后，其返回值被赋给一个Object类型的变量
//        f(New.map());
    }
}
