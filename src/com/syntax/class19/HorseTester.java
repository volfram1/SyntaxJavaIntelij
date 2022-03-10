package com.syntax.class19;

public class HorseTester {
    public static void main(String[] args) {
        //calling the constructor "Horse"
        Horse horse=new Horse("Jacky", 20,400);

        /*
        Horse --> data type(name of the class)
        horse --> object/instance/reference variable/variable
        = --> assignment operator
        Horse("Jacky", 20,400) -> call to the constructor
        ; --> line terminator
         */
        horse.printHorseName();
    }
}
