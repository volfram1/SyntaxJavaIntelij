package com.syntax.class17TypesOfVariables;

public class HealthyDog {
    String name;  // instance variable
    String color; //instance variable
    static int numberOfLegs=4;  // static variable

    void eat(){
        int numberOfTimes=3; // local
        System.out.println(name+" eats "+numberOfTimes);
    }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog();  // local

        dog.name="scooby"; //when the information is expected to be different from object to object --> instance variable
        dog.color="Pink"; //when the information is expected to be different from object to object --> instance variable
        HealthyDog.numberOfLegs=4; //if something will stay the same on every object --> static
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tomy"; //when the information is expected to be different from object to object --> instance variable
        dog2.color="Navy Blue"; //when the information is expected to be different from object to object --> instance variable
        HealthyDog.numberOfLegs=6; //with static variables always use class name
        System.out.println(HealthyDog.numberOfLegs); // static if changed will change everywhere
        dog2.eat();

    }
}
