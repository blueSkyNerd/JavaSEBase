package com.blucewang.ClassRelate.ClassLoad;

/**
 * 对一个类的被动引用:
 * 1）子类调用父类的静态常量，子类不会被初始化。只有父类被初始化。对于静态字段，只有直接使用这个字段的类才会被出事后
 * 2）通过数组定义来引用类，不会触发类的初始化
 * 3）访问类的常量，不会初始化
 * Created by bluceWang on 2017/3/29.
 */
public class PassiveReferenceTest {
    public static void main(String[] args) {
//        System.out.println(SuperClass.superVal);//被动引用1
//        System.out.println(SubClass.subVal);//被動引用2
        System.out.println(ConstClass.HELLO_WORLD);//被動引用3
    }
}

class SuperClass{
    static{
        System.out.println("init SupperClass");
    }

    public static String superVal="SupperClass";
}

class SubClass extends SuperClass{
    static {
        System.out.println("init subClass");
    }

    public static String subVal="subClass";
}

class ConstClass{
    static {
        System.out.println("ConstClass init");
    }

    public static final String HELLO_WORLD="hello world";
}


