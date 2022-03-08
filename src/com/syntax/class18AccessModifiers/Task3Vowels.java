package com.syntax.class18AccessModifiers;

public class Task3Vowels {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling its name.
     */

    private static String onlyVowels(String input){
        //String newStr=input.replaceAll("[^aeiouAEIOU]","");
        //return newStr;

        return input.replaceAll("[^aeiouAEIOU]","");
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("Emili")); // onlyVowels can be called without creating an object because both methods are static
    }

}
