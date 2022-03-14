package com.syntax.class19Constructors;

public class Horse {
    private String name;
    private int age;
    private double weight;

    //---------- constructor -----------------
    Horse(String horseName, int horseAge, double horseWeight ){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }

    //----------- constructor end --------------

    void printHorseName(){
        System.out.println("Name "+name);
    }

    void setName(String horseName){
        name=horseName;
    }

}
