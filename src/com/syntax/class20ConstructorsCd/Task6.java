package com.syntax.class20ConstructorsCd;
/*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

public class Task6 {

    String bookName;
    double price;

    public Task6() {
        System.out.println("No argument constructor");
    }

    public Task6(String bookName, double price) {
        this();
        this.bookName = bookName;
        this.price = price;
        System.out.println("2 argument constructor");

    }
}
