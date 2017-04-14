package com.blucewang.chapter10_innerClass;//: innerclasses/Parcel7.java
// Returning an instance of an anonymous inner class.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parcel7 {
  public Contents contents() {
    return new Contents() { // Insert a class definition
      private int i = 11;
      public int value() { return i; }
    }; // Semicolon required in this case
  }
  public static void main(String[] args) {
    Parcel7 p = new Parcel7();
    Parcel7 p2 =new Parcel7();
    Contents c = p.contents();
    List<Parcel7> pList = new ArrayList<Parcel7>(Arrays.asList(p)) ;
    pList.add(p2);
    System.out.println(pList.toString());


  }
} ///:~
