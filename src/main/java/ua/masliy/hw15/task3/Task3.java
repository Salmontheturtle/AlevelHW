package ua.masliy.hw15.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        List<String> ourSmallCollection = new ArrayList<>();
        String str1 = "LalalLlalalahohohohohohohxoxoxoxox ";
        String str2 = "I'm sooo unsure what i'm doing. Are ";
        String str3 = " collections are so difficult";
        String str4 = "or me so dumb";
        ourSmallCollection.add(str1);
        ourSmallCollection.add(str2);
        ourSmallCollection.add(str3);
        ourSmallCollection.add(str4);
        System.out.println(listToMap(ourSmallCollection));
    }

     public static Map<String, Integer> listToMap(List<String> ourList) {
        if (ourList == null) {
            return null;
        }
        Map<String, Integer> ourMap = new HashMap<>(ourList.size());
        for (String str : ourList) {
            ourMap.put(str, str.length());
        }
        return ourMap;
    }
}
