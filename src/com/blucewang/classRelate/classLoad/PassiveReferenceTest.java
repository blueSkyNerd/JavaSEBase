package com.blucewang.classRelate.classLoad;

/**
 * ��һ����ı�������:
 * 1��������ø���ľ�̬���������಻�ᱻ��ʼ����ֻ�и��౻��ʼ�������ھ�̬�ֶΣ�ֻ��ֱ��ʹ������ֶε���Żᱻ���º�
 * 2��ͨ�����鶨���������࣬���ᴥ����ĳ�ʼ��
 * 3��������ĳ����������ʼ��
 * Created by bluceWang on 2017/3/29.
 */
public class PassiveReferenceTest {
    public static void main(String[] args) {
//        System.out.println(SuperClass.superVal);//��������1
//        System.out.println(SubClass.subVal);//��������2
        System.out.println(ConstClass.HELLO_WORLD);//��������3
    }
}

class SuperClass{

    public static String superVal="SupperClass";

    static{
        System.out.println("init SupperClass");
    }
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


