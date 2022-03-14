package com.syntax.class22SuperKeyword;

public class ClassA {
    void method(){
        System.out.println("Method from classA");
    }
}
class ClassB extends ClassA{
     void method(){
        System.out.println("method from ClassB");
    }
    void test(){
         method();
         this.method();
         super.method();
    }

}

class Tester{
    public static void main(String[] args) {
        ClassB classB=new ClassB();
        classB.test();
    }
}
