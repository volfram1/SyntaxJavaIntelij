package com.syntax.class22;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
        child.printInfo();
    }
}

class Grandparent{
    String color="Blue";
    void printInfo(){
        System.out.println("I am Grand");
    }

}

class Parent extends Grandparent{
    String color="Black";
    void printInfo(){
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    String color="Red";
    void printInfo(){
        System.out.println("I am Child");
    }
    void print(){
        printInfo();
        super.printInfo();
    }


    void printColor(){
        String color="Green";  // prefers local variable over child class variable
        System.out.println(color); // refers to child class
        System.out.println(this.color); // prints the child class variable if we have local variable
        System.out.println(super.color); // SUPER refers to parent class

    }

}
