//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package com.blucewang.chapter10_innerClass.controller;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0)
            // Make a copy so you're not modifying the list
            // while you're selecting the elements in it:
            //有意思，如果直接在遍历中修改数据，则会报错：ConcurrentModificationException
            for (Event e : new ArrayList<>(eventList))
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
    }
} ///:~
