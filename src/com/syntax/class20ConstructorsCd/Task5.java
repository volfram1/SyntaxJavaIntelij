package com.syntax.class20ConstructorsCd;
/*Write a Student class   that have instance variables name and address.
Create a constructor that will initialize those variables.
Print name & address of given  student using displayInfo method.
 */

public class Task5 {
    String name;
    String address;

    public Task5(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo(){
        System.out.println(this.name+" "+this.address);
    }
}
