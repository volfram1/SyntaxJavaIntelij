package com.syntax.class30ArrayListVSLinkedlist.txt;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numberList= new ArrayList<>();
        Double double1=new Double(10.5);
        double number=double1.doubleValue(); // converting to primitive double (unboxing)
        Double number2=new Double(number); //boxing - converting primitive to Double class (wrapping)
        double number3=10.5;
        Double number4=number3; // same as line 8 -- automatic conversion -- autoBoxing
        number3=number4; // autoUnboxing

    }
}
