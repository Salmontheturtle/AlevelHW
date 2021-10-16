package ua.masliy.hw17.task5;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Maintenance {
    static List<Box> boxes = new LinkedList<>();


    public static boolean boxFilter(Box box) {
        List<Integer> integers = new LinkedList<>();
        for (Box value : boxes) {
            integers.add((int) value.getSize());
        }
        final int minValue = Stream.of(integers)
                .mapToInt(List::size)
                .min()
                .getAsInt();
        final int maxValue = Stream.of(integers)
                .mapToInt(List::size)
                .max()
                .getAsInt();
        return box.getSize() >= minValue && box.getSize() <= maxValue;
    }

    public static List<Box> boxFilling(List<Box> boxes) {
        for (int i = 0; i < 10; i++) {
            boxes.add(new Box());
            System.out.println((int) boxes.get(i).getSize());
        }
        return boxes;
    }
}
