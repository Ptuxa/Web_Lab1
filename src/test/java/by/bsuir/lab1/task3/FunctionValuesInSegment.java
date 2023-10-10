package by.bsuir.lab1.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FunctionValuesInSegment {
    @Test
    void takeListIfBGreaterA() {
        double a = 3.5;
        double b = 22.1;
        double h = 2.3;

        List<Double> listSegmentValuesExpected = Arrays.asList(0.37458, -0.52466, -3.98239, 1.47566, 0.13443, -0.85599, -47.07300, 0.93242, -0.09140);
        List<Double> listSegmentValuesActual = Main.takeListFunctionValuesInSegment(a, b, h);

        Assertions.assertEquals(listSegmentValuesExpected.size(), listSegmentValuesActual.size());

        for (int i = 0; i < listSegmentValuesActual.size(); i++) {
            Assertions.assertEquals(listSegmentValuesExpected.get(i), listSegmentValuesActual.get(i), 0.01);
        }
    }

    @Test
    void takeListIfALessB() {
        double a = 22.1;
        double b = 3.5;
        double h = 2.3;

        List<Double> listSegmentValuesActual = Main.takeListFunctionValuesInSegment(a, b, h);

        Assertions.assertEquals(0, listSegmentValuesActual.size());
    }
}
