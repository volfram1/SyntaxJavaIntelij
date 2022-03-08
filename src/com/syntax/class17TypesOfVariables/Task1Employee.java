package com.syntax.class17TypesOfVariables;

public class Task1Employee {
    /*
    Create a Class called Employee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class Employee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */

    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {

        Task1Employee aselObject=new Task1Employee();
        aselObject.empId="122";
        aselObject.salary=200000;
        System.out.println(aselObject.empId);
        System.out.println(aselObject.empId);
        System.out.println(Task1Employee.CEO); //use the name of the class for static variables instead of object name

        Task1Employee mozzamObject=new Task1Employee();
        mozzamObject.empId="222";
        mozzamObject.salary=198000;
        System.out.println(mozzamObject.empId);
        System.out.println(mozzamObject.salary);
        System.out.println(Task1Employee.CEO);



    }

}
