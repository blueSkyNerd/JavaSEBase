package com.blucewang.chapter18_io.extra;

import java.io.Serializable;

/**
 * Created by bluceWang on 2017/6/22.
 */
public class Person implements Serializable {

//    private static final long serialVersionUID = 1L;

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
