package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        LOGGER.info("Thực hiện phép cộng: {} + {}", a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        LOGGER.info("Thực hiện phép trừ: {} - {}", a, b);
        return a - b;
    }

    public int multiply(int a, int b) {
        LOGGER.info("Thực hiện phép nhân: {} * {}", a, b);
        return a * b;
    }

    public double divide(int a, int b) {
        LOGGER.info("Thực hiện phép chia: {} / {}", a, b);
        if (b == 0) {
            LOGGER.error("Lỗi: Không thể chia cho 0!");
            throw new IllegalArgumentException("Không thể chia cho 0!");
        }
        return (double) a / b;
    }
}
