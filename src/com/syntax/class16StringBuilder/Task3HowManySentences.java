package com.syntax.class16StringBuilder;

public class Task3HowManySentences {
    /*
    You have a String a=” Is it saturday? Is it raining? Do we have a Java Class today?”
    How would you find out how many sentences are in that String?
     */

    public static void main(String[] args) {
        String s="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(s.split("[?]").length);
    }
}
