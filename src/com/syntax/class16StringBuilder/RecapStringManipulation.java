package com.syntax.class16StringBuilder;

import java.util.Arrays;

public class RecapStringManipulation {
    public static void main(String[] args) {
        String str="This is my #1234567 Tarik";
        String str2="Batch 12 is good";
        String str3="123456!#$#%%$&asdnkaASGJHFT";
        String str4="This is a sentence";
        String str5="This is a sentence. batch 12 is great. Edward is not great. He is super great";
        System.out.println(("******************* charAt() **********************"));
        System.out.println(str.charAt(0));  //returns a character of the index in ()
        System.out.println(str.charAt(3));  //returns a character of the index in ()
        System.out.println(str.charAt(str.length()-1));  //last character of the String
        System.out.println("********************* indexOF ***************************");
        System.out.println(str.indexOf("A")); //returns an index of that character (-1 if the character do not exist)
        System.out.println(str.indexOf('a')); ////returns an index of that character
        System.out.println(str.lastIndexOf("a")); //returns the last index of the character
        System.out.println("********************** SUBSTRING ****************************");
        System.out.println(str.indexOf("#"));
        System.out.println(str.substring(str.indexOf("#"))); //returns everything starting from #
        System.out.println(str.substring(str.indexOf("#")+1));  //returns everything after #
        System.out.println(str.substring(12,23)); //hardcoding
        System.out.println(str.substring(str.indexOf("#")+1,str.indexOf("#")+1+8)); //+8 how long is the part of string
        System.out.println("**************** REPLACE() ***********************");
        System.out.println(str2.replace("good","great")); //replaces whole word
        System.out.println(str2.replace("o","0"));  //replaces one character
        System.out.println(str2.replace(" ","_"));
        System.out.println(str2.replace(" ","")); //removes spaces
        System.out.println(str2.replace("12","13")); //replaces
        System.out.println("*********************** replaceALL *****************************");
        System.out.println(str3.replaceAll("[0-9]","")); //removes all numbers
        System.out.println(str3.replaceAll("[a-z]","")); //replace all small letters
        System.out.println(str3.replaceAll("[A-Z]","")); //replace all upper case letters
        System.out.println(str3.replaceAll("[!-.]",""));  //replace special characters range
        System.out.println(str3.replaceAll("[a-zA-Z!-.]",""));
        System.out.println(str3.replaceAll("[^a-zA-Z0-9]","")); //replaces all except (^-not)
        System.out.println("********************** split() ***********************");
        String[] strArr=str4.split(" ");
        System.out.println(Arrays.toString(strArr)); //creates an array of words from the sentence, based on what's in ()
        System.out.println(strArr.length);  // how many arguments in array
        System.out.println(strArr[0]);      //prints the argument with index 0
        System.out.println(strArr[3]);      //prints the argument with index 3
        String[] strArr2=str5.split("[.]");
        System.out.println(strArr2.length);
        System.out.println(strArr2[3].trim()); // trim removes spaces at the beginning and at the end of the string




    }
}
