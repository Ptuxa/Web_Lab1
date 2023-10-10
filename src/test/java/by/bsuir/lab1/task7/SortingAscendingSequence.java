package by.bsuir.lab1.task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingAscendingSequence {
    @Test
    void sortingSequence() {
        double[] arrInput = new double[] {2.3, 100.1, -5.9, 93, 97.0, -7.8, 14, 2.5, -5.3};
        double[] arrExpected = new double[] {-7.8, -5.9, -5.3, 2.3, 2.5, 14, 93, 97.0, 100.1};

        Main.sortAscendingSequence(arrInput);

        for (int i = 0; i < arrInput.length; i++) {
            Assertions.assertEquals(arrInput[i], arrExpected[i], 0.1);
        }
    }
}
