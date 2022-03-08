package com.syntax.class15StringManipulation;

public class Task1method {

    void checkUserNamePassword(String userName, String password, String confirmPassword){
        if(userName.isEmpty()||password.isEmpty()){
            System.out.println("cannot be empty");
        }else{
            if(password.length()<8){
                System.out.println("pass to short");
            }else{
                if(password.contains(userName)){
                    System.out.println("cannot contain username");
                }else{
                    if(password.equals(confirmPassword)) {
                        System.out.println("has been created");
                    }else{
                        System.out.println("pass do not match");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

        String userName = "Asel";
        String password = "pass1234";
        String confirmPassword = "pass1234";

        Task1method task1= new Task1method();
        task1.checkUserNamePassword(userName,password,confirmPassword);


    }
}
