package ua.masliy.hw17.task5;

public class Item {
    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }
    static int index = 0;
    private final String name;
    private final Integer cost;

    public Item() {

        this.name = "Item number " + index;
        this.cost = (int)(Math.random() * (55555 - 10) + 10);
        index++;
    }
}
