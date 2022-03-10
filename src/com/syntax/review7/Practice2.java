package com.syntax.review7;

public class Practice2 {

    String getRecord(){       // return type method
        String department="QA";
        String empName="Violet";
        String details="Worker "+empName+" belongs to "+department;
        System.out.println(details);
        return details;

    }

    public static void main(String[] args) {
        Practice2 p=new Practice2();  // defining the object,
        p.getRecord();          // calling a method
    }
}
