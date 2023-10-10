package by.bsuir.lab1.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertTrue;


public class CheckingPointInRectangle {
    @Test
    void checkPointInRectangleFirst() {
        int x = -5;
        int y = -2;
        Assertions.assertTrue(Main.checkIsPointPositionInFigure(x, y));
    }

    @Test
    void checkPointInRectangleSecond() {
        int x = 0;
        int y = 4;
        Assertions.assertTrue(Main.checkIsPointPositionInFigure(x, y));
    }

    @Test
    void checkPointInRectangleBoth() {
        int x = 0;
        int y = 0;
        Assertions.assertTrue(Main.checkIsPointPositionInFigure(x, y));
    }

    @Test
    void checkPointNotInRectangle() {
        int x = -7;
        int y = 0;
        Assertions.assertFalse(Main.checkIsPointPositionInFigure(x, y));
    }
}
