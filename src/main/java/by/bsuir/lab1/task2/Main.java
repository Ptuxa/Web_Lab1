package by.bsuir.lab1.task2;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static Rectangle rectangleFirst = new Rectangle(-6, 0, 6, -3);
    private final static Rectangle rectangleSecond = new Rectangle(-4, 5, 4, -3);

    public static boolean checkIsPointPositionInFigure(int x, int y) {
        return (rectangleFirst.checkIsPointPositionInRectangle(x, y) || rectangleSecond.checkIsPointPositionInRectangle(x, y));
    }
    
    public static void main(String[] args) {
        checkIsPointPositionInFigure(0,4);
    }
}
