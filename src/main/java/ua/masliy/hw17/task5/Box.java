package ua.masliy.hw17.task5;

import java.util.List;

public class Box {
    private List<Item> item;

    public List<Item> getItem() {
        return item;
    }

    private double size = (Math.random() * (111 - 1) + 1);

    public double getSize() {
        return size;
    }
}
