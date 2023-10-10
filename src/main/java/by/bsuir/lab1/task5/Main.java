package by.bsuir.lab1.task5;

public class Main {

    private static int binarySearch(int[] arr, int leftIndex, int rightIndex, int currValue) {
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

    public static int findMinAmountElementsOutAscendingSequence(int[] arr) {
        boolean isSortedSequence = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSortedSequence = false;
                break;
            }
        }
        if (isSortedSequence) {
            return 0;
        }

        int length = 0;
        int[] extraArr = new int[arr.length];
        extraArr[0] = Integer.MIN_VALUE;
        for (int i = 1; i < extraArr.length; i++) {
            extraArr[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {
            int j = binarySearch(extraArr, 0 ,arr.length-1, arr[i]);
            if (extraArr[j - 1] < arr[i] && arr[i] < extraArr[j]) {
                extraArr[j] = arr[i];
                length = Math.max(length, j);
            }
        }
        return arr.length - length;
    }
}
