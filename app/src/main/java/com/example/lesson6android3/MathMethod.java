package com.example.lesson6android3;

public class MathMethod {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0)
            return 0;
        else
            if (a == 0) return 0;
        return a / b;
    }

}
