package com.syntax.class23MethodOverloading;

public class MethodOverloadingDemo1 {
    public static void main(String[] args) {
        add(10);
        add(10,10);
        add(10,10,10);
    }

    static void add(int ...numArray){
        int sum=0;
        for (int num:numArray){
            sum=sum-num;
        }
        System.out.println(sum);
    }


}
