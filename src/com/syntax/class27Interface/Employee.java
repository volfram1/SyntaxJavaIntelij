package com.syntax.class27Interface;

public interface Employee {
    int age=10;
    void work();
}
class Tester implements Employee{
    @Override
    public void work() {
        System.out.println("testing a website");
    }

    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.work();
        System.out.println(Employee.age);
    }
}
