package org.calculator;

// ScientificCalculatorTest.java
// Author: Girish Kumar Sahu
// Date: 25th Feb 2025
// Unit Test for Scientific Calculator

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {

    @Test
    void testCalculateSquareRoot() {
        assertEquals(5.0, ScientificCalculator.calculateSquareRoot(25), 0.0001);
        assertEquals(3.1622, ScientificCalculator.calculateSquareRoot(10), 0.0001);
    }

    @Test
    void testCalculateFactorial() {
        assertEquals(120, ScientificCalculator.calculateFactorial(5));
        assertEquals(1, ScientificCalculator.calculateFactorial(0));
        assertEquals(1, ScientificCalculator.calculateFactorial(1));
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.calculateFactorial(-3));
    }

    @Test
    void testCalculateLogarithm() {
        assertEquals(0, ScientificCalculator.calculateLogarithm(1), 0.0001);
        assertEquals(2.3025, ScientificCalculator.calculateLogarithm(10), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.calculateLogarithm(0));
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.calculateLogarithm(-5));
    }

    @Test
    void testCalculatePower() {
        assertEquals(16.0, ScientificCalculator.calculatePower(2, 4), 0.0001);
        assertEquals(1.0, ScientificCalculator.calculatePower(5, 0), 0.0001);
        assertEquals(0.25, ScientificCalculator.calculatePower(2, -2), 0.0001);
    }
}