package by.bsuir.lab1.task1;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static double inputDoubleValue(double doubleX, double doubleY) {
        double valueXPlusY = Math.sin(doubleX + doubleY);
        return (1 + valueXPlusY * valueXPlusY) / (2 + Math.abs(doubleX - (2 * doubleX / (1 + doubleX * doubleX * doubleY * doubleY)))) + doubleX;
    }

    public static void main(String[] args) {
        System.out.println(inputDoubleValue(0, 0));
    }
}
