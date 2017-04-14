package com.blucewang.chapter15_generic;//: generics/TupleTest2.java

import com.blucewang.common.util.FiveTuple;
import com.blucewang.common.util.FourTuple;
import com.blucewang.common.util.ThreeTuple;
import com.blucewang.common.util.TwoTuple;

import static com.blucewang.common.util.Tuple.tuple;

//靜態導入Tuple中的tuple方法

public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() {
        return tuple("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(),
                "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        new Object();
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        //TODO 方法f2（）返回的是非参数化的twoTuple,编译器没有报警告，是因为我们并没有将其返回值作为参数化对象使用
        System.out.println(f2());
        TwoTuple twoTuple = (TwoTuple<String, Integer>)f2();
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
} /* Output: (80% match)
(hi, 47)
(hi, 47)
(Amphibian@7d772e, hi, 47)
(Vehicle@757aef, Amphibian@d9f9c3, hi, 47)
(Vehicle@1a46e30, Amphibian@3e25a5, hi, 47, 11.1)
*///:~
