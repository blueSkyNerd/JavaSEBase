package com.blucewang.chapter14.two;

/**
 * 获取Class的方式有几种，通过getClass()方法获取，通过对象.class的方式获取，通过Class对象.forName()方式来获取
 *
 * Created by bluceWang on 2017/1/19.
 */
public class ToyTest {
    static  void printInfo(Class clazz){
        System.out.println("Class name " + clazz.getName()+" is interface? ["+clazz.isInterface()+"]");
        System.out.println("Simple name "+ clazz.getSimpleName());
        System.out.println("Cananical name " + clazz.getCanonicalName());
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        Class<?> toyClass=null;
        try {
            //打印对象Class对应的信息
             toyClass= Class.forName("com.blucewang.chapter14.two.FancyToy");
            printInfo(toyClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //打印对象Class实现接口的信息
        for(Class interfaceClazz : toyClass.getInterfaces()){
                printInfo(interfaceClazz);
        }
        //打印对象Class继承父类接口的信息
        Class<?> superclass = toyClass.getSuperclass();
        //通过Class类实例化对象
        Object instance = null;
        try {
            /**
             * 创建此 Class 对象所表示的类的一个新实例。如同用一个带有一个空参数列表的 new 表达式实例化该类。如果该类尚未初始化，则初始化这个类。
             *注意，此方法传播 null 构造方法所抛出的任何异常，包括已检查的异常。使用此方法可以有效地绕过编译时的异常检查，而在其他情况下编译器都会执行该检查。
             * Constructor.newInstance 方法将该构造方法所抛出的任何异常包装在一个（已检查的）InvocationTargetException 中，从而避免了这一问题。
             *	Class[] empty = {};
             * final Constructor<T> c = getConstructor0(empty, Member.DECLARED);
             * 需要用到默认的构造方法，没有默认的构造方法会抛错
             */
             instance = superclass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(instance.getClass());
    }

}
