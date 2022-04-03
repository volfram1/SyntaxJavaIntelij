package com.syntax.class26Abstraction;

public abstract class Phone {
    void makePhoneCall(){
        System.out.println("Making a phone call");
    }
    void sendText(){
        System.out.println("Sending text");
    }

  abstract  void displayPicture();

}
class Iphone extends Phone {
    @Override
    void displayPicture() {
        System.out.println("use the photo app to display");
    }
}
class Samsung extends Phone{
    @Override
    void displayPicture() {
        System.out.println("use gallery ");
    }
}
