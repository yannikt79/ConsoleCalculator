package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Test
    public void testSummeZweiPositivIsOk(){
        calculator = new Calculator();
        assertTrue(calculator.summe(10,25) == 35);
    }
}