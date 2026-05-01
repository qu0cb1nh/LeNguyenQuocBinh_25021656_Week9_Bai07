package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 phải bằng 5");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3), "4 - 3 phải bằng 1");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 phải bằng 6");
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 phải bằng 2.0");
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Không thể chia cho 0", exception.getMessage());
    }
}
