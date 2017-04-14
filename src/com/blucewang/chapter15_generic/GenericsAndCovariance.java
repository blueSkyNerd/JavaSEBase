package com.blucewang.chapter15_generic;//: generics/GenericsAndCovariance.java

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {

        //泛型对协变的不支持
//        List<Number> nList = new ArrayList<Integer>();

        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // Compile Error: can't add any type of object:
        //泛型不支持协变
//        flist.add(new Apple());
        // flist.add(new Fruit());
        //为什么连Object都放不进去？
//         flist.add(new Object());
        flist.add(null); // Legal but uninteresting
        // We know that it returns at least Fruit:
        Fruit f = flist.get(0);
    }
} ///:~
