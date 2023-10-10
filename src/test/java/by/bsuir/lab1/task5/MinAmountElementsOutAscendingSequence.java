package by.bsuir.lab1.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinAmountElementsOutAscendingSequence {
    @Test
    void findAmountElementsShortSequence() {
        int expected = 1;
        int actual = Main.findMinAmountElementsOutAscendingSequence(new int[] {1, 2, 4, 3});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAmountElementsLongSequence() {
        int expected = 5;
        int actual = Main.findMinAmountElementsOutAscendingSequence(new int[] {12, 11, 68, 42, 44, 9, 102, 58, 8, 103});
        Assertions.assertEquals(expected, actual);
    }
}
