package ua.masliy.hw17;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = Stream.generate(() -> new Random().nextInt(228) - 111)
                .limit(55)
                .collect(Collectors.toList());
        int minValue = list.stream().reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(minValue);
    }
}
