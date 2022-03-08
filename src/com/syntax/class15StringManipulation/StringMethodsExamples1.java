package com.syntax.class15StringManipulation;

public class StringMethodsExamples1 {
    public static void main(String[] args) {
        String s="Aga Aga";

        if(s.length()<=12){
            //less than equal to 12 characters in name
            System.out.println("user name created ");
        }else{
            //to long name
            System.out.println(" This name is to long");
        }
    }
}
