package com.syntax.class29IntroToCollections;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Poland");
        countries.add("Eritea");
        countries.add("Gana");
        countries.add("Iraq");
        countries.add("Afghanistan");
        countries.add("Germany");

        System.out.println(countries.get(3)); // adding element to the array (at the end by default)
        System.out.println(countries.get(2));
        System.out.println(countries);

        countries.add(4,"Pakistan"); // adding element in specific index
        System.out.println(countries);
        System.out.println(countries.size());

        countries.remove("Pakistan"); // removes the element
        countries.clear(); // removes everything from the arraylist
        System.out.println(countries.size());





    }
}
