package com.syntax.class16StringBuilder;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        String s=new String("Asghar is Great"); //creates the object
        System.out.println(s.replace(" ",""));
        System.out.println(s);

        System.out.println("**************** String Builder ****************");

        //String builder will modify the original string

        StringBuilder strBuil=new StringBuilder("Asghar is Great");
        //strBuil.reverse();  //reverse string  //in comment because lines 10 and 11 together will reverse twice
        System.out.println(strBuil.reverse()); //printing reverse String
        System.out.println(strBuil);
        System.out.println(strBuil.append("Haha")); // append --> the same as concat() but in StringBuilder

        StringBuilder str= new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            str.append(i);
        }


    }
}
