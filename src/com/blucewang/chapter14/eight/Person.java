package com.blucewang.chapter14.eight;

/**
 * Created by bluceWang on 2017/3/13.
 */
public class Person {

    private String first;

    private String last;

    private String address;

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class NullPerson extends Person implements Null{
        private NullPerson() {
            super("NONE", "NONE", "NONE");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}
