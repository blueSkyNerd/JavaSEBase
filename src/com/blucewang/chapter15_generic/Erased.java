package com.blucewang.chapter15_generic;//: generics/Erased.java
// {CompileTimeError} (Won't compile)

public class Erased<T> {
    private static final int SIZE = 100;

    public static void f(Object arg) {
       /* if (arg instanceof T) {
        }          // Error
        T var = new T();                 // Error
        T[] array = new T[SIZE];         // Error*/
//        T[] array = (T) new Object[SIZE]; // Unchecked warning
    }
} ///:~
