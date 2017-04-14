package com.blucewang.chapter15_generic.practice;

/**
 * Created by bluceWang on 2017/4/8.
 */
interface GenericGetName {
    String getName();
}

interface GenericGetAge {
    Integer getAge();
}

class GenericGetPersionPorpoties{
    public static  <T extends GenericGetName> String getName(T ggt){
        return ggt.getName();
    }

    public static <T extends GenericGetAge> Integer getAge(T gga){
        return gga.getAge();
    }

    public static void main(String[] args) {
        LiLiWang person = new LiLiWang();
        System.out.println(GenericGetPersionPorpoties.getAge(person));
        System.out.println(GenericGetPersionPorpoties.getName(person));
    }
}

public class LiLiWang implements GenericGetAge,GenericGetName {
    @Override
    public Integer getAge() {
        return 18;
    }

    @Override
    public String getName() {
        return "liliWang";
    }

}
