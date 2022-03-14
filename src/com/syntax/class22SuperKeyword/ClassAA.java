package com.syntax.class22SuperKeyword;

public class ClassAA {
    String name;
    int age;
    double weight;

    public ClassAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
class ClassBB extends ClassAA{
    public ClassBB(String name, int age, double weight){
        super(name,age,weight);  // calling the constructor from Parent
    }

}
class Test{
    public static void main(String[] args) {
        ClassBB classBB=new ClassBB("tristan",25,65);
        classBB.printInfo();
    }



}
