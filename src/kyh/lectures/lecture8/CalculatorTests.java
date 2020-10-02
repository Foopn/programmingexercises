package kyh.lectures.lecture8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Calculator")
public class CalculatorTests {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Testing that addition works")
    void addition() {
        assertEquals(3, calculator.add(1, 2));
        assertEquals(5, calculator.add(-5, 10));
        assertEquals(1400000, calculator.add(700000, 700000));
    }
}