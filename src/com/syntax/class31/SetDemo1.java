package com.syntax.class31;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");  // do not maintain insertion order
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");  //Set does not allow duplicate values so when printed will not print
        System.out.println(fruit);
    }
}
