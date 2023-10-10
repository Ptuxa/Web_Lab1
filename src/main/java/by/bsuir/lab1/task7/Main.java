package by.bsuir.lab1.task7;

public class Main {
    public static void sortAscendingSequence(double[] arrNumbers) {
        int i = 1;

        while (i < arrNumbers.length - 1) {
            if (arrNumbers[i] <= arrNumbers[i + 1]) {
                i++;
            } else {
                if (arrNumbers[i] != arrNumbers[i + 1]) {
                    arrNumbers[i] = arrNumbers[i] + arrNumbers[i + 1];
                    arrNumbers[i + 1] = arrNumbers[i] - arrNumbers[i + 1];
                    arrNumbers[i] = arrNumbers[i] - arrNumbers[i + 1];
                }

                if (i > 0) {
                    i--;
                }
            }
        }
    }
}
