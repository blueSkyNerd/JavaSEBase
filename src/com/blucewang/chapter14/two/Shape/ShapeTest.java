package com.blucewang.chapter14.two.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ���е�����ת������������ʱ������ȷ���ģ�RTTI:������ʱ��ʶ��һ����������ͣ�
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
