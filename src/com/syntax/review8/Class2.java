package com.syntax.review8;

public class Class2 {

    String generateUserName(String firstName, String lastName){
        return firstName+"123"+lastName+".com";
    }

     static void moreedDemand(){
         System.out.println("this is moreed's functions");
    }

    public static void main(String[] args) {
        moreedDemand(); // for static method
        Class2 obj=new Class2();
        System.out.println(obj.generateUserName("emilia","gulnar")); // for non-static method
    }
}
