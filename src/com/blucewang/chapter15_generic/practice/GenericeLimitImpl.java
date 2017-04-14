package com.blucewang.chapter15_generic.practice;

/**
 * Created by bluceWang on 2017/4/6.
 */
public class GenericeLimitImpl implements GenericLimitInterferce {
    @Override
    public void say() {
        System.out.println("hello");
    }

    @Override
    public String getSayName(Integer sayId) {
        return sayId+" name";
    }

    public static void main(String[] args) {
        GenericLimit<GenericeLimitImpl> limit = new GenericLimit<GenericeLimitImpl>(new GenericeLimitImpl());
        limit.say();
        System.out.println(limit.getSayName(125));
    }
}
