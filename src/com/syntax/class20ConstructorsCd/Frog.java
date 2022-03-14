package com.syntax.class20ConstructorsCd;

public class Frog {
    String name;
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age, double weight) {
        this(name,color,age);  //should be the first call to the constructor
        this.weight = weight;
    }

    public Frog(String name, String color, int age) {

        this.name = name;
        this.color = color;
        this.age = age;

    }

    void printInfo(){
       System.out.println(name+" "+color+" "+age+" "+weight);
   }


}
