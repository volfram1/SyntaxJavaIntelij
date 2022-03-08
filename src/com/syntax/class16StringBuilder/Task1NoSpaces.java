package com.syntax.class16StringBuilder;

public class Task1NoSpaces {
    public static void main(String[] args) {
        /*
        Create a String that will hold a sentence. Write a program to get a new String without any spaces.
         */
        String sent="This is a sentence";
        String newStr=sent.replace(" ", "");
        System.out.println(newStr);
    }
}
