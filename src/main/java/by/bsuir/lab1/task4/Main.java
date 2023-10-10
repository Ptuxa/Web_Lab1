package by.bsuir.lab1.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static boolean isPrimeNumber(int number) {
        if (number > 1) {
            int multiplier = 2;
            while (multiplier <= Math.sqrt(number)) {
                if (number % multiplier == 0) {
                    return false;
                }

                multiplier++;
            }

            return true;
        }

        return false;
    }

    public static List<Integer> findPrimeNumbers(int[] arrInput) {
        List<Integer> listPrimeIndexes = new ArrayList<>();

        for (int i = 0; i < arrInput.length; i++) {
            if (isPrimeNumber(arrInput[i])) {
                listPrimeIndexes.add(i);
            }
        }

        return listPrimeIndexes;
    }
}
