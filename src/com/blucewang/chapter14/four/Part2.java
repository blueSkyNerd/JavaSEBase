package com.blucewang.chapter14.four;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bluceWang on 2017/3/20.
 */
class Part2 {
    public String toString() {
        return getClass().getSimpleName();
    }

//    static List<Class<? extends Part2>> partClasses = Arrays.asList(FuelFilter2.class);

}

class Filter2 extends Part2 {
}

class FuelFilter2 extends Filter2 {
}

class AirFilter2 extends Filter2{}


