package com.syntax.class25Polymorphism;

public class Task1 {
    public static void main(String[] args) {

    }
}
class Student{
    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("students must do homeworks");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudents extends Student{
    void study(){
        System.out.println("Syntsc students must study 25 hours a week");
    }
    void doHomeWork(){
        System.out.println("must solve repls");
    }
    void practice(){
        System.out.println("do research");
    }
}
class CollegeStudent extends Student{
    @Override
    void doHomeWork() {
        System.out.println("can skip some homework");
    }
}
class SchoolStudent extends Student{

}
