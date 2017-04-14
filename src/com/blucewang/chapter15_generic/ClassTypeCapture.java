package com.blucewang.chapter15_generic;//: generics/ClassTypeCapture.java

import java.util.HashMap;
import java.util.Map;

class Building {
}

class House extends Building {
}

public class ClassTypeCapture<T> {
    Class<T> kind;

    private Map<String,Class<?>> types = new HashMap<String, Class<?>>();

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public void addType(String typeName,Class<?> kind){
        types.put(typeName,kind);
    };

    public Object createNew(String typeName){
        Class<?> newObj = types.get(typeName);
        try {
            return newObj.newInstance();
        } catch (NullPointerException e) {
            System.out.println("not find a register obj name :"+typeName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 =
                new ClassTypeCapture<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 =
                new ClassTypeCapture<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

        System.out.println("createTest==============");
        ctt1.addType("house",House.class);
        ctt1.addType("building",Building.class);
        System.out.println(ctt1.createNew("house"));
        System.out.println(ctt1.createNew("room"));
    }
} /* Output:
true
true
false
true
*///:~
