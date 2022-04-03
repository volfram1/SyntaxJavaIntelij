package com.syntax.class23MethodOverloading;
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */

public class Task1 {
    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("Dmitri","123456","USA");
        userInfo.userDetails();
    }

}
class userClass{
    String name;
    String mobileNumber;

    public userClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends userClass{
    String userAddress;

    public UserInfo(String name, String mobileNumber,String userAddress) {
        super(name, mobileNumber);
        this.userAddress = userAddress;
    }



    void userDetails(){
        System.out.println("name "+name+" mobileNumber "+mobileNumber+" address "+userAddress);
    }
}
