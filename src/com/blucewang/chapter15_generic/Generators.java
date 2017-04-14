package com.blucewang.chapter15_generic;

import com.blucewang.chapter15_generic.coffee.Coffee;
import com.blucewang.chapter15_generic.coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by bluceWang on 2017/3/29.
 */
public class Generators {
    public static  <T> Collection<T> fill(Collection<T> collection,Generator<T> gen,int n){
        for(int i=0;i<n;i++){
            T next = gen.next();
            collection.add(next);
        }
        return collection;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 5);
        for (Coffee coffee :
                coffees) {
            System.out.println(coffee.getClass().getName());
        }
        Collection<Integer> integers = fill(new ArrayList<Integer>(), new Fibonacci(), 5);

        for (Integer i :
                integers) {
            System.out.print(i+" ");
        }
    }
}
