package by.bsuir.lab1.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Matrix {
    @Test
    void takeMatrixFourAndFive() {
        double[] arrInput = new double[] {5.6, 3.2, -2.0};
        double[][] matrixExpected = new double[][] {
                {5.6, 3.2, -2.0},
                {3.2, -2.0, 5.6},
                {-2.0, 5.6, 3.2},
        };

        double[][] matrixActual = Main.takeMatrix(arrInput);

        Assertions.assertEquals(matrixExpected.length, matrixActual.length);

        for (int i = 0; i < matrixActual.length; i++) {
            for (int j = 0; j < matrixActual[0].length; j++) {
                Assertions.assertEquals(matrixExpected[i][j], matrixActual[i][j], 0.01);
            }
        }
    }
}
