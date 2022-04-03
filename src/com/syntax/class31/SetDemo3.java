package com.syntax.class31;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

        // TreeSet removes the duplicates and sorts them in alphabetical order

        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("z");
        fruit.add("a");
        fruit.add("b");
        fruit.add("g");
        fruit.add("d");
        fruit.add("z");
        System.out.println(fruit);
    }
}
