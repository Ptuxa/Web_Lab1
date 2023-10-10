package by.bsuir.lab1.task3;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static List<Double> takeListFunctionValuesInSegment(double a, double b, double h) {
        List<Double> listFunctionValues = new ArrayList<>();
        double currentXOfSegment = a;

        while (currentXOfSegment <= b) {
            listFunctionValues.add(Math.tan(currentXOfSegment));

            currentXOfSegment = currentXOfSegment + h;
        }

        return listFunctionValues;
    }

    public static void main(String[] args) {
        double a = 3.5;
        double b = 22.1;
        double h = 2.3;
        List<Double> list = takeListFunctionValuesInSegment(a, b, h);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
