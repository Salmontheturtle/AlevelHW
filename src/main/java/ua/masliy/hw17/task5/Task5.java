package ua.masliy.hw17.task5;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Box> boxList = Maintenance.boxFilling(Maintenance.boxes);
        boxList.stream()
                .filter(Maintenance::boxFilter)
                .map(Box::getItem)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparing(Item::getCost))
                .forEach(System.out::println);
    }
}
