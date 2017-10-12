package com.blucewang.classRelate.classLoad;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wnagyb on 2017/8/15.
 */
public class CastException {

    public static Map map = new HashMap() {
        {
            put("a", "2");
        }
    };

    public static void main(String[] args) {
        Integer i = (Integer) map.get("a");
        System.out.println(i);
    }
}
