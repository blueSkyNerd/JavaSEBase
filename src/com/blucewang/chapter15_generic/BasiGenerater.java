package com.blucewang.chapter15_generic;

/**
 * Created by bluceWang on 2017/3/29.
 */
public class BasiGenerater<T> implements Generator<T> {

    private Class<T> type;

    public BasiGenerater(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        T t = null;
        try {
             t = type.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> Generator<T> create(Class<T> type){
        return new BasiGenerater<T>(type);
    }
}
