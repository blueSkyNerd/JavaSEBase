package com.blucewang.chapter15_generic;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by bluceWang on 2017/4/8.
 */
public class FactoryCapture {
    Map<String, FactoryI<?>> factoryMap = new HashMap<String, FactoryI<?>>();

    public void addType(String typeName, FactoryI<?> factory) {
        factoryMap.put(typeName, factory);
    }

    public Object createObj(String typeName) {
        FactoryI<?> factroy = factoryMap.get(typeName);
        if (factroy == null) {
            throw new NullPointerException("没找到类型为" + typeName + "工厂对象");
        }
        return factroy.create();
    }
}
