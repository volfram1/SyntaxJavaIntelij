package com.syntax.class28InterfaceVSAbstractClass;

public class SmartWatchTester {
    public static void main(String[] args) {
        AppleWatch appleWatch=new AppleWatch(2,16,1.5,"Apple");
        appleWatch.showHealthTips();
        AppleWatch.displayTime();
    }
}
