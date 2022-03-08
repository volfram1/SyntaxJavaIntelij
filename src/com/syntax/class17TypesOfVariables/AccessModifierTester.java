package com.syntax.class17TypesOfVariables;

import com.syntax.class18AccessModifiers.AccessModifiers;
import com.syntax.class18AccessModifiers.Task2ReversedString;

public class AccessModifierTester {
    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        /*
         only public is accessible
         System.out.println(am.name); //private
         System.out.println(am.age);  // default
         System.out.println(am.weight); // protected
        */
        System.out.println(am.color);  // public


            String name="Emily";
            System.out.println(Task2ReversedString.reverseString(name));
    }
}

