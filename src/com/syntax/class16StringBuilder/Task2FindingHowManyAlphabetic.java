package com.syntax.class16StringBuilder;

public class Task2FindingHowManyAlphabetic {
    /*
    Create a String that should be combination of letters, numbers and special characters.
    Find out how many Alphanumeric characters are there in the String.
     */
    public static void main(String[] args) {
        String s="1234hdbhjAZ123$%^";
        System.out.println(s.replaceAll("[A-Za-z0-9]","").length());
    }
}
