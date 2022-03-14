package com.syntax.class19Constructors;

public class Human {
    String name;
    int age;
    double weight;
    char gender;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Human(String name, int age, double weight) {
         this (name,age);   // ---------------> this.name = name;
                                            // this.age = age;
        this.weight = weight;

    }

    public Human(String name, int age, double weight, char gender) {
        this (name,age,weight);            // this.name = name;
                                           // this.age = age;
                                           //this.weight = weight;
        this.gender = gender;
    }
}
