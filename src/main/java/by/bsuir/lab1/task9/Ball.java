package by.bsuir.lab1.task9;

public class Ball {
    private final Color color;
    private final double weight;


    public Ball(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}
