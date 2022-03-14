package com.syntax.class20;

public class Task3Constructors {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different package  and observe result.
     */

    private Task3Constructors() {
        System.out.println("private");
    }
    Task3Constructors(double a) {
        System.out.println("default");
    }
    protected Task3Constructors(String a) {
        System.out.println("protected");
    }
    public Task3Constructors(boolean a) {
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task3Constructors();
        new Task3Constructors("haha");
        new Task3Constructors(10.2);
        new Task3Constructors(false);
    }
}
