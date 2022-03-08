package com.syntax.class17TypesOfVariables;

public class Task1StudentsHW {
    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Task1StudentsHW student1=new Task1StudentsHW();
        student1.name="Yazgul";
        student1.id="123";
        Task1StudentsHW.numberOfStudents++;

        Task1StudentsHW student2=new Task1StudentsHW();
        student2.name="Zuhoor";
        student2.id="234";
        Task1StudentsHW.numberOfStudents++;

        Task1StudentsHW student3=new Task1StudentsHW();
        student3.name="Sayed";
        student3.id="456";
        Task1StudentsHW.numberOfStudents++;

        System.out.println(numberOfStudents);


    }
}
