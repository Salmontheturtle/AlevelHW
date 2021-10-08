package ua.masliy.hw16;


import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {

        String string = "А роза упала на лапу Азора";
        treeMap(string);

    }

    public static void treeMap(String string){
        Map<String, Integer> map = new TreeMap<>();
        String[] str = string.replaceAll("[^ a-zA-Zа-яА-ЯёЁ0-9]", " ")
                .toLowerCase(Locale.ROOT)
                .split(" ");
        for (String words : str) {
            Integer counter = map.get(words);
            if (words == null || counter == null) {
                counter = 0;
            }
            map.put(words, ++counter);
        }
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
