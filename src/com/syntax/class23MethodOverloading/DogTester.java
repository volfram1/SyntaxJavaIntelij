package com.syntax.class23MethodOverloading;

public class DogTester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println(dog);
        Dog dog2=new Dog("Tommy","green","RedBull",12,12.5);
        dog2.changeInfo("Rocky","Black","BullDog");
        System.out.println(dog2);

    }

}
