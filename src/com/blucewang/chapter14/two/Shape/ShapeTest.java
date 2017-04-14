package com.blucewang.chapter14.two.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 所有的类型转换都是在运行时进行正确检查的，RTTI:在运行时，识别一个对象的类型；
 *
 * Created by bluceWang on 2017/1/19.
 */
public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle(),new Rhomboid());
        for (Shape shape:
             shapes) {
            shape.draw();
        }
    }
}
