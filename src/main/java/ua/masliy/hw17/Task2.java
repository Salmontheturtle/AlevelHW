package ua.masliy.hw17;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Stream<Integer> list = Stream.generate(() -> (int) (Math.random() * (199 - 1) + 1))
                .limit(111);
        IntSummaryStatistics stats = list.filter(x -> x >= 0)
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println(stats);
    }
}
