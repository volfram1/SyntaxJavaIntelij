package com.syntax.class31;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        //LinkHashSet --> maintains insertion order
        // do not accept duplicates

        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
