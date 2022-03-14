package com.syntax.class19Constructors;

public class Task2StudentTester {
    public static void main(String[] args) {

        Task2Student maha = new Task2Student("maha", 95, 96, 92);
        maha.printAvgGrade();
        new Task2Student("aga",98,95,97).printAvgGrade();
    }
}
