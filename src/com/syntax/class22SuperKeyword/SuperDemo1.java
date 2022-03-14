package com.syntax.class22SuperKeyword;

public class SuperDemo1 {
}
class AAA{
    AAA(){

    }

}
class BBB{
    String name;
    BBB(){

    }
    BBB(String name){
        super();
        // this();  we cant use this() and super() inside the same constructor
        this.name=name;
    }
}
