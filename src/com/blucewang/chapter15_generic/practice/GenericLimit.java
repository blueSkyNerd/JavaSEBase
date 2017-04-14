package com.blucewang.chapter15_generic.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bluceWang on 2017/4/6.
 */
public class GenericLimit<T extends GenericLimitInterferce> {
    T t;

    public GenericLimit(T t) {
        t=t;
    }

    public void say(){
        t.say();
    }

    public String getSayName(Integer id){
        return t.getSayName(id);
    }

    public static void main(String[] args) {
        List<String> strList =  new ArrayList<String>();
        List<Integer> List =  new ArrayList<Integer>();
        System.out.println(strList.getClass());
        System.out.println(strList.getClass()==List.getClass());
    }
}
