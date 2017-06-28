package com.blucewang.chapter18_io.extra;

import java.io.Serializable;

/**
 * Created by bluceWang on 2017/6/22.
 */
public class Teacher implements Serializable{
    private final static long serialVersionUID=1L;

    private String name;

    private Person person;

    public Teacher(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
