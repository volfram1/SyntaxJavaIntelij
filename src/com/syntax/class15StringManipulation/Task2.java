package com.syntax.class15StringManipulation;

public class Task2 {
    public static void main(String[] args) {

        String father="Daniel";
        String mother="Mary";
        String expectation="boy";
        String firstPart="";
        String secondPart="";

        if (expectation.equalsIgnoreCase("boy")){
            firstPart=father.substring(0,father.length()/2);
            secondPart=mother.substring(mother.length()/2);
        } else if(expectation.equalsIgnoreCase("girl")){
            secondPart=father.substring(father.length()/2);
            firstPart=mother.substring(0,mother.length()/2);
        }
        System.out.println(firstPart+secondPart);
    }
}
