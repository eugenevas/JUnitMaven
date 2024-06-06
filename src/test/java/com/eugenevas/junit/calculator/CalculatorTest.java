package com.eugenevas.junit.calculator;

import com.eugenevas.junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void sum() {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(10, 15);
        Assertions.assertEquals(25, sum);
    }

    @Test
    void evenOrOdd_evenNumber() {
        Calculator calculator = new Calculator();
        boolean even = calculator.evenOrOdd(10);
        Assertions.assertTrue(even);
    }

    @Test
    void evenOrOdd_oddNumber() {
        Calculator calculator = new Calculator();
        boolean odd = calculator.evenOrOdd(15);
        Assertions.assertFalse(odd);
    }


}
