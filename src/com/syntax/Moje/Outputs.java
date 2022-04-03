package com.syntax.Moje;

public interface Outputs{
    void display(double result);
}
interface Functions extends Outputs{
    double adding(double firstNumber,double secondNumber);
    double subtracting(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double dividing(double firstNumber, double secondNumber);
}
class Main implements Functions{
    @Override
    public double adding(double firstNumber, double secondNumber) {
        return firstNumber+secondNumber;
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        return firstNumber-secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        return firstNumber/secondNumber;

    }

    @Override
    public void display(double result) {
        System.out.println("Result is ::: "+result);
    }

    public static void main(String[] args) {
        double firstNumber=100.00;
        double secondNumber=20.00;

        Main main=new Main();
        main.display(main.adding(firstNumber,secondNumber));
        main.display(main.subtracting(firstNumber,secondNumber));
        main.display(main.multiply(firstNumber,secondNumber));
        main.display(main.dividing(firstNumber,secondNumber));
    }
}
