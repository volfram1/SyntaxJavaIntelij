package com.syntax.class27Interface;

public interface MyInterface {
    void method1();
    void method2();
}
class MyInterfaceTester implements MyInterface {


    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {
        MyInterfaceTester myInterfaceTester=new MyInterfaceTester();
        myInterfaceTester.method1();
        myInterfaceTester.method2();
    }
}
