package com.blucewang.chapter15_generic;//: generics/GenericsAndCovariance.java

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {

        //���Ͷ�Э��Ĳ�֧��
//        List<Number> nList = new ArrayList<Integer>();

        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // Compile Error: can't add any type of object:
        //���Ͳ�֧��Э��
//        flist.add(new Apple());
        // flist.add(new Fruit());
        //Ϊʲô��Object���Ų���ȥ��
//         flist.add(new Object());
        flist.add(null); // Legal but uninteresting
        // We know that it returns at least Fruit:
        Fruit f = flist.get(0);
    }
} ///:~
