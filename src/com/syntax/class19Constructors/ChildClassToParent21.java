package com.syntax.class19Constructors;

import com.syntax.class21Inheritance.Parent;

public class ChildClassToParent21 extends Parent {

        void printInfo(){
             //System.out.println(name); //--> private cannot be inherited by child class
            //System.out.println(age); // default --> default in Parent class in package 21
            System.out.println(weight); // protected
            System.out.println(color);  // public
        }

}
