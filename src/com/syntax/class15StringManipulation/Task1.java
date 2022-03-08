package com.syntax.class15StringManipulation;

public class Task1 {

    /*
    Accept username, password and confirm password from a user and check following requirements:
    Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
    Password should be minimum 8 characters, if less → message=”Password is too short”.
    Password cannot contain username if so, → message=”Password cannot contain username”.
    Password should match confirmed password, if not  → message=“Passwords do not match”.
    Only after all requirements met → message “Your username and password has been created”
     */
    public static void main(String[] args) {
        String userName = "Asel";
        String password = "pass1234";
        String confirmPassword = "pass1234";
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

    }