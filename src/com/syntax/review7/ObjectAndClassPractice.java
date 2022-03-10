package com.syntax.review7;

public class ObjectAndClassPractice {

    String empName;
    int empID;
    String group;


    void employeeDetails()  {  // declaring a method void (no return type)
        System.out.println("This method shows emp details");
    }
    void employeeGroup(){       // declaring a method void (no return type)
        System.out.println("This method shows group");
    }

    public static void main(String[] args) {
        ObjectAndClassPractice obj=new ObjectAndClassPractice();  //creating an object
        obj.employeeDetails(); //calling the method "employeeDetails"
        obj.employeeGroup();    // calling the method "employeeGroup"
    }
}
