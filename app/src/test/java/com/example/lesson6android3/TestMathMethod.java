package com.example.lesson6android3;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMathMethod {
    protected MathMethod mathMethod;

    @Before
    public void getInstance() {
        mathMethod = new MathMethod();
        System.out.println("Before");
    }


    @Test
    public void add() {
        assertEquals(6, mathMethod.add(2, 4));
        System.out.println("add test");
    }

    @Test
    public void subtract() {
        assertEquals(-2, mathMethod.subtract(2, 4));
        System.out.println("subtract test");
    }

    @Test
    public void multiply() {
        assertEquals(8, mathMethod.multiply(2, 4));
        System.out.println("multiply test");
    }

    @Test
    public void divide() {
        assertEquals(2, mathMethod.divide(4, 2));
        assertEquals(0, mathMethod.divide(12, 0));
        System.out.println("divide test");
    }


    @After
    public void end() {
        System.out.println("after");
    }
}
