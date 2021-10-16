package ua.masliy.hw17;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        int strLength = 10;
        String[] arr = new String[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < strLength; j++) {
                char code = (char) (rnd.nextInt(94) + 33);
                stringBuilder.append(code);
            }
            arr[i] = stringBuilder.toString();
        }
        System.out.println(Arrays.toString(arr));
        Stream.of(arr).sorted().forEach(System.out::println);
    }
}
