package by.bsuir.lab1.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PrimeNumbers {
    @Test
    void findPrimeNumbers() {
        List<Integer> listExpected = List.of(0, 3, 4, 6);
        List<Integer> listActual = Main.findPrimeNumbers(new int[] {2, 8, 4, 7, 23, 28, 11, 15, 51});
        Assertions.assertEquals(listExpected, listActual);
    }
}
