package com.syntax.class18AccessModifiers;

public class AccesModifierTester {

    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        // System.out.println(am.name); variable name is private and cannot be accessed
        System.out.println(am.age);
        System.out.println(am.color);
        System.out.println(am.color);
    }
}
