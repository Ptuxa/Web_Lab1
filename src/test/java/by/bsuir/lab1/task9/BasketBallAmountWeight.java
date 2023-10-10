package by.bsuir.lab1.task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BasketBallAmountWeight {
    @Test
    public void findWeight() {
        Basket basket = new Basket(Arrays.asList(
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

        Assertions.assertEquals(50.7, Main.findWeight(basket.getList()));
    }

    @Test
    public void findBlueAmount() {
        Basket basket = new Basket(Arrays.asList(
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

        Assertions.assertEquals(3, Main.findBlueBallAmount(basket.getList()));
    }
}
