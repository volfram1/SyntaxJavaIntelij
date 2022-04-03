package com.syntax.class23MethodOverloading;

public class MethodOverloadingDemo2 {
    void printInfo(String name, int age, double weight){
        System.out.println("M1");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(int age,String name, double weight){
        System.out.println("M2");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(double weight, String name,int age){
        System.out.println("M3");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(double weight, int age, String name){
        System.out.println("M4");
        System.out.println(name+" "+age+" "+weight);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 methodOverloadingDemo2=new MethodOverloadingDemo2();
        methodOverloadingDemo2.printInfo("Zulfiya",16,28);

    }
}
