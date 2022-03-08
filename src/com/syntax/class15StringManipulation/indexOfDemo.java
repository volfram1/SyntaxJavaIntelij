package com.syntax.class15StringManipulation;

public class indexOfDemo {
    public static void main(String[] args) {
        String name="how are @you @guys @";
        System.out.println(name.indexOf("@"));  // index of the character
        System.out.println(name.indexOf("are")); // index of the first character
        System.out.println(name.lastIndexOf("@")); // last index of character
        System.out.println(name.indexOf("@",8+1)); //index of next character
        System.out.println(name.indexOf("%")); //output is -1 because the character doesn't exist
        System.out.println(name.indexOf("@",name.indexOf("@")+1)); //same like line 9 but no hardcoding
    }
}
