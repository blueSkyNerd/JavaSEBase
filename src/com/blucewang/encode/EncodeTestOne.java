package com.blucewang.encode;

import java.io.UnsupportedEncodingException;

/**
 * Created by dongdaqing on 2017/8/11.
 */
public class EncodeTestOne {

    public static void main(String[] args) {
        String name="I am 散户";
        try {
            name.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
