package com.syntax.class23MethodOverloading;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    public Dog() {
        System.out.println("No argument constructor");
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void changeInfo(String name){
        this.name=name;
    }
    void changeInfo(String name, String color){
        this.name=name;
        this.color=color;

    }
    void changeInfo(String name, String color, String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
