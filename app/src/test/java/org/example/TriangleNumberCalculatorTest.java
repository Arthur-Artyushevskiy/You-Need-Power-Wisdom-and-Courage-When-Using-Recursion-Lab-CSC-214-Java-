package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleNumberCalculatorTest {

    TriangleNumberCalculator calculator = new TriangleNumberCalculator();

    @Test
    public void testValue() {

        assertEquals(1, calculator.value(1), "Value of 1 should be 1");


        assertEquals(6, calculator.value(3), "Value of 3 should be 6");


        assertEquals(15, calculator.value(5), "Value of 5 should be 15");
    }

    @Test
    public void testInvalidInput() {

        assertEquals(-1, calculator.value(0), "Value of 0 should return -1");
        assertEquals(-1, calculator.value(-5), "Value of negative numbers should return -1");
    }

    @Test
    public void testAdd() {

        assertEquals(16, calculator.add(3, 4), "Adding value(3) and value(4) should be 16");


        assertEquals(4, calculator.add(1, 2), "Adding value(1) and value(2) should be 4");
    }

    @Test
    public void testSubtract() {

        assertEquals(7, calculator.subtract(4, 2), "Subtracting value(2) from value(4) should be 7");


        assertEquals(0, calculator.subtract(3, 3), "Subtracting value(3) from itself should be 0");
    }

    @Test
    public void testMultiply() {
        // value(3) = 6, value(2) = 3. 6 * 3 = 18
        assertEquals(18, calculator.multiply(3, 2), "Multiplying value(3) and value(2) should be 18");

        // value(1) = 1, value(4) = 10. 1 * 10 = 10
        assertEquals(10, calculator.multiply(1, 4), "Multiplying value(1) and value(4) should be 10");
    }

    @Test
    public void testDivide() {
        // value(4) = 10, value(2) = 3. 10 / 3 = 3.333...
        // We use a delta (0.001) for double comparisons
        assertEquals(3.333, calculator.divide(4, 2), 0.001, "10 divided by 3 should be approx 3.333");

        // value(3) = 6, value(1) = 1. 6 / 1 = 6.0
        assertEquals(6.0, calculator.divide(3, 1), 0.001, "6 divided by 1 should be 6.0");
    }

    @Test
    public void testSequence() {

        List<Integer> expected = Arrays.asList(1, 3, 6, 10);
        ArrayList<Integer> actual = calculator.sequence(4);

        assertEquals(expected, actual, "The sequence for n=4 should be [1, 3, 6, 10]");


        List<Integer> expectedSingle = Arrays.asList(1);
        assertEquals(expectedSingle, calculator.sequence(1), "The sequence for n=1 should be [1]");
    }
}
