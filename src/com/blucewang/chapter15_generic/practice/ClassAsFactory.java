package com.blucewang.chapter15_generic.practice;

import com.blucewang.chapter14.two.Waterproof;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by bluceWang on 2017/4/8.
 */
public class ClassAsFactory<T> {
    Class<T> kind;

    public ClassAsFactory(Class<T> kind) {
        this.kind = kind;
    }

    public T create(int arg) {
        try {
            //间接的方法，
            for(Constructor<?> ct: kind.getConstructors()){
                Class<?>[] parameterTypes = ct.getParameterTypes();
                if(parameterTypes.length==1&&parameterTypes[0]==int.class){
                    return kind.cast(ct.newInstance(arg));
                }
            }

            //直接的方法
//            Constructor<T> constructor = kind.getConstructor(int.class);
//            return constructor.newInstance(arg);
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        ClassAsFactory<Waterproof> waterproofClassAsFactory = new ClassAsFactory<Waterproof>(Waterproof.class);
        Waterproof waterproof = waterproofClassAsFactory.create(1);
        if(waterproof==null){
            System.out.println("waterproof don't have the constructor with a integer arg");
        }else{
            System.out.println(waterproofClassAsFactory.toString());
        }

        ClassAsFactory<Integer> integerClassAsFactory = new ClassAsFactory<Integer>(Integer.class);
        Integer integer = integerClassAsFactory.create(2);
        if (integer==null){
            System.out.println("Integer don't have the constructor with a integer arg");
        }else {
            System.out.println(integer.toString());
        }
    }
}
