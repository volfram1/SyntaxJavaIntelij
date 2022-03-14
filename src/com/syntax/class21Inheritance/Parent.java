package com.syntax.class21Inheritance;

public class Parent {
    private String name;
    int age;
    protected double weight;
    public String color;

}
class Child extends Parent{
    void printInfo(){
        // System.out.println(name); --> private cannot be inherited by child class
        System.out.println(age); // default
        System.out.println(weight); // protected
        System.out.println(color);  // public
    }
}
