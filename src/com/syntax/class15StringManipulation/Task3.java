package com.syntax.class15StringManipulation;

public class Task3 {
    public static void main(String[] args) {
        String str="Hello";

        if (str.length()%2!=0 && str.length()>=3){
            System.out.println(str.charAt(str.length()/2));
        }
    }
}
