package com.syntax.class30ArrayListVSLinkedlist.txt;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> fruts =new ArrayList<>();
        fruts.add("Apple");
        fruts.add("Orange");
        fruts.add("Banana");

        ArrayList<String> vegetables =new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Carrot");

        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(fruts);
        groceries.addAll(vegetables);
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);




    }
    }

