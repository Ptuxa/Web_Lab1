package by.bsuir.lab1.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int binarySearch(double[] arr, int leftIndex, int rightIndex, double currValue) {
        int middleIndex = -1;
        if (currValue < arr[leftIndex])
            return leftIndex;
        if (currValue > arr[rightIndex])
            return rightIndex;

        while (leftIndex <= rightIndex) {
            middleIndex = (leftIndex + rightIndex) / 2;
            if (currValue >= arr[middleIndex] && currValue < arr[middleIndex + 1])
                return middleIndex + 1;
            if (currValue < arr[middleIndex])
                rightIndex = middleIndex - 1;
            if (currValue > arr[middleIndex])
                leftIndex = middleIndex + 1;
        }
        return middleIndex;
    }

    public static List<Integer> findIndexes(double[] arrFirst, double[] arrSecond) {
        List<Integer> list = new ArrayList<>();

        for (double value : arrSecond) {
            list.add(binarySearch(arrFirst, 0, arrFirst.length - 1, value));
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> expected = findIndexes(new double[] {1, 3, 4, 6, 8}, new double[] {8, 7, 13, 25, 5, 3});
        for (int i = 0; i < expected.size(); i++) {
            System.out.println(expected.get(i));
        }
    }
}
