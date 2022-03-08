package com.syntax.class18AccessModifiers;

public class accountTester {
    public static void main(String[] args) {
        Account account=new Account();

        // System.out.println(account.userName); //cannot be accessed directly but can be accessed through methods
        // System.out.println(account.password);
        // System.out.println(account.balance);
        System.out.println(account.accountNumber);

        // account.printUsername(); //private method cannot be accessed from other class
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();
    }
}
