package com.syntax.class23MethodOverloading;

public class StaticDemo {
}

class Cat{
    static int NoOfLegs=4;
    String name;
    Cat(String name){
        this.name=name;
    }

    public void printInfo(){
        System.out.println(name+NoOfLegs);
    }
    public static void print(){
        // we can't access the instance fields directly inside static method
        //  System.out.println(name+NoOfLegs);
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");
        Cat.print();
        Cat cat2=new Cat("nutella");
        Cat.print();
    }
}
