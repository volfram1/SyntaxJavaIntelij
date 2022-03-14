package com.syntax.class22SuperKeyword;

public class Parent1 {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }

}
class Child1 extends Parent1 {
    String name = "Child";
    void printName() {
        String name="Teyfuring";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

class ParentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName();

    }

}
