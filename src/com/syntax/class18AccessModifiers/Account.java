package com.syntax.class18AccessModifiers;

public class Account {
    //bank application

    private String userName="Teyfur";
    private String password="Admin";
    public String accountNumber="123456";
    private double balance=-1500;

    private void printUsername(){

        System.out.println(userName);
    }
    protected void printPassword(){

        System.out.println(password);
    }
    void printBalance(){
        System.out.println(balance);
    }
    public void printAccountNumber(){
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {

        Account account=new Account();

        System.out.println(account.userName);
        System.out.println(account.password);
        System.out.println(account.balance);
        System.out.println(account.accountNumber);

        account.printUsername();
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();
    }



}
