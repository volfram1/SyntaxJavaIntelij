package com.syntax.class23MethodOverloading;
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
class Shape{
    double radius;

        public Shape(double radius) {
            this.radius = radius;
        }
    }
    class Circle extends Shape{

        public Circle(double radius) {
            super(radius);
        }
        void calculateArea(){
            System.out.println(Math.PI*Math.pow(radius,2));


        }
    }



    public class Task2 {

        public static void main(String[] args) {
            Circle circle=new Circle(2);
            circle.calculateArea();

        }
}
