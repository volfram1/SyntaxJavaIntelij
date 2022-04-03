package com.syntax.class27Interface;

public interface Human {
    // public static final redundant because by default all the variables are public static final
    int legs=2;

    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
    public default void noNeedToWorry(){
        System.out.println("default methods are there to functional programing");
    }
}
class Maha implements Human{
    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        Maha maha=new Maha();
        maha.walk();
        Human.printLegs();
    }
}
