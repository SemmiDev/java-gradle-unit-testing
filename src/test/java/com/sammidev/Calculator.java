package com.sammidev;

public class Calculator {

    private double number1;
    private double number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double adding() {
        return this.number1 + this.number2;
    }
    public double substraction() {
        return this.number1 - this.number2;
    }
    public double multiplication() {
        return this.number1 * this.number2;
    }
    public double division() {
        return this.number1 / this.number2;
    }
}