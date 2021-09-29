package ua.masliy.hw15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ua.masliy.hw15.task3.Task3.listToMap;

public class Hw15Task3 {
    static Map<String, Integer> map;

    @BeforeEach
    void setMap() {
        map = new HashMap<>();
        map.put("string", 6);
        map.put("", 0);
        map.put("streng", 6);
        map.put("stringg", 7);
        map.put("str", 3);
    }

    @Test
    void strRightComparison() {
        List<String> list = Arrays.asList("string", "streng", "stringg", "str", "");
        Assertions.assertEquals(listToMap(list), map);
    }

    @Test
    void strWrongComparison() {
        List<String> list = Arrays.asList("string", "streng", "stringg", "str", " ");
        Assertions.assertNotEquals(listToMap(list), map);
    }

    @Test
    void nullListTest() {
        Assertions.assertNull(null);
    }
}
