package com.syntax.class16StringBuilder;

public class Task5Palindrome {

    boolean isPalindrome(String inputStr){
        String reversedStr=reverse(inputStr);
        return reversedStr.equals(inputStr);
    }
    String reverse(String inputString){
        StringBuilder str=new StringBuilder(inputString); //converting String to StringBuilder
        str.reverse();
        return str.toString();



    }
    public static void main(String[] args) {
        //IF string is a palindrome

        Task5Palindrome task=new Task5Palindrome();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("abbc"));

    }
}
