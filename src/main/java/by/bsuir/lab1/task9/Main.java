package by.bsuir.lab1.task9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static int findBlueBallAmount(List<Ball> listBall) {
        int amount = 0;

        for (Ball ball : listBall) {
            if (ball.getColor().equals(Color.BLUE)) {
                amount++;
            }
        }
        return amount;
    }

    public static double findWeight(List<Ball> listBall) {
        double weight = 0;

        for (Ball ballElement : listBall) {
            weight = weight + ballElement.getWeight();
        }

        return weight;
    }



    private static Basket inputBasketData() {
        return new Basket(Arrays.asList(
                new Ball(1.1, Color.BLACK),
                new Ball(2.3, Color.RED),
                new Ball(3.5, Color.ORANGE),
                new Ball(4.7, Color.YELLOW),
                new Ball(5.9, Color.GREEN),
                new Ball(6.1, Color.BLUE),
                new Ball(6.3, Color.PURPLE),
                new Ball(7.5, Color.GREEN),
                new Ball(8.8, Color.WHITE),
                new Ball(1.5, Color.BLUE),
                new Ball(3.0, Color.BLUE)
        ));
    }

    private static void outputData(Basket basket) {
        System.out.println("Summary weight: " + findWeight(basket.getList()));
        System.out.println("Blue ball amount: " + findBlueBallAmount(basket.getList()));
    }

    public static void main(String[] args) {
        Basket basket = inputBasketData();

        outputData(basket);
    }
}
