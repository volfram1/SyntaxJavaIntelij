package com.syntax.class27Interface;

public class CarTester {
    public static void main(String[] args) {
        Car car=new BMW();
        car.move();
        car.drive();
        DriveAble driveAble=new BMW();
        driveAble.drive();

    }
}
