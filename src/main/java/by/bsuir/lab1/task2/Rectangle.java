package by.bsuir.lab1.task2;

public class Rectangle {
    private int x0;
    private int y0;
    private int x1;
    private int y1;

    public Rectangle(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    public boolean checkIsPointPositionInRectangle(int x, int y) {
        return x >= Math.min(x0, x1) && x <= Math.max(x0, x1) && y >= Math.min(y0, y1) && y <= Math.max(y0, y1);
    }

    public int getX0() {
        return x0;
    }

    public int getX1() {
        return x1;
    }

    public int getY0() {
        return x1;
    }

    public int getY1() {
        return y1;
    }
}
