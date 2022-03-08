package com.syntax.class15StringManipulation;

public class CharAtDemo {
    public static void main(String[] args) {
        String name="how are you guys @";
        System.out.println(name.charAt(0));
        for (int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i)+"_");
        }

    }


}
