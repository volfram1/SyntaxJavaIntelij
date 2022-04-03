package com.syntax.class24MethodOverriding;

public class AlisParent {
    String girlName="Salma";
    double money=10000000;

    void marry(){
        System.out.println("Ali you should marry "+girlName);
    }
}

class Ali extends AlisParent{
    String girlName="Rihanna";
    void marry(){
        super.marry();
        System.out.println("But daddy I want to marry "+girlName);

    }

}
