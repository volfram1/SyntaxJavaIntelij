package com.syntax.class25Polymorphism;

public class Task1Tester {
    public static void main(String[] args) {
        SyntaxStudents syntaxStudents=new SyntaxStudents();
        syntaxStudents.study();

        Student[] students={new SchoolStudent(), new SchoolStudent(),new CollegeStudent()};
        for(Student student:students){
            student.study();
            student.doHomeWork();

        }
    }
}
