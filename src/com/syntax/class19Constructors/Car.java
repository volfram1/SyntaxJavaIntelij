package com.syntax.class19Constructors;

public class Car {
    String  name;
    String make;
    String color;
    String type;


    public Car(String name, String make, String color, String type) {
        name = name;
        make = make;
        color = color;
        type = type;
    }

    Car(){

    }

    void printCar(){
        String name="Tesla";
        System.out.println(name);
    }
}
