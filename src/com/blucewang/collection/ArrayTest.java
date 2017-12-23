package com.blucewang.collection;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;

/**
 * Created by bluceWang on 2017/12/20.
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strArr = new String[5];
        System.out.println(Arrays.toString(strArr));

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c","ｄ","e","f"));
        for (String str:
             list) {
            if("aa".equals(str)){
                System.out.println(str);
            }
        }

//        for (int i=0;i<list.size();i++){
//            if("aa".equals(list.get(i))){
//                list.remove(i);
//            }
//        }
        list.add("g");
        list.add("h");
        System.out.println(Arrays.toString(list.toArray()));


        list.removeAll(new ArrayList<Integer>(){{
            add(1);
        }});

        HashSet<String> set = new HashSet<String>() {{
            add("aa");
            add("cc");
        }};
        String[] strings = set.toArray(new String[set.size()]);
        System.out.println(strings.toString());
    }


}
