package com.syntax.class18AccessModifiers;

public class Task2ReversedString {
    /*
    Create a method that will take a String as a parameter and returns reversed String. Method
    should be available to all classes within your project and accessible by class name.
     */

    public static String reverseString(String input){
        /* StringBuilder stringBuilder=new StringBuilder(input); //creating an object + storing that object in a different variable
        stringBuilder.reverse(); //reversing the String
        return stringBuilder.toString(); // reversed String back to String
        */
        //************** shorter way (in one line) **************
        return new StringBuilder(input).reverse().toString(); //recommended --> creating the object --> calling a method reverse --> back to string
    }

    public static void main(String[] args) {
        String name="Emily";
        System.out.println(Task2ReversedString.reverseString(name)); // because the method is static we can call it by name of the class (Task2REv...)
    }
}
