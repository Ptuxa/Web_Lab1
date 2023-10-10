package by.bsuir.lab1.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateFunctionValues {
    @Test
    void calculateWithBothPositiveValues() {
        double x = 287.3142;
        double y = 13.532;
        double expectedValue = 287.31925;
        double actualValue = Main.inputDoubleValue(x, y);
        assertEquals(expectedValue, actualValue, 0.01);
    }

    @Test
    void calculateWithBothNegativeValues() {
        double x = -287.3142;
        double y = -13.532;
        double expectedValue = -287.309148;
        double actualValue = Main.inputDoubleValue(x, y);
        assertEquals(expectedValue, actualValue, 0.01);
    }

    @Test
    void calculateWithZeroValues() {
        double x = 0;
        double y = 0;
        double expectedValue = 0.5;
        double actualValue = Main.inputDoubleValue(x, y);
        assertEquals(expectedValue, actualValue, 0);
    }
}