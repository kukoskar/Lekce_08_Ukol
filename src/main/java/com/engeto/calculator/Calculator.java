package com.engeto.calculator;

public class Calculator {

    public long add(int a, int b) {
        return a+b;
    }

    public long subtract(int a, int b) {
        return a-b;
    }

    public long multiply(int a, int b) {
        return a*b;
    }

    public double divide(int a, int b) {
        return (double) a/b;
    }


    public double squareRoot(int a) throws ArithmeticException {
        if (a<0) {
            throw new ArithmeticException("Negative number is not allowed!");
        }
        return Math.sqrt(a);
    }

    public double square(int a) {
        return (double) a*a;
    }

    public double areaOfCircle(int a) throws ArithmeticException {
        if (a<0) {
        throw new ArithmeticException("Negative number is not allowed!");
    }
        double p=3.14;
        return p*(a*a);
    }


}
