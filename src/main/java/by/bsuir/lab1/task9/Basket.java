package by.bsuir.lab1.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> list;

    public Basket() {
        this.list = new ArrayList<>();
    }

    public Basket(List<Ball> list) {
        this.list = list;
    }

    public List<Ball> getList() {
        return list;
    }
}
