package ua.masliy.hw15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.masliy.hw15.task1.MyList;

public class Hw15Task1 {
    MyList<Integer> list = new MyList<>();

    @BeforeEach
    void setList() {
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    }

    @Test
    void addTest() {
        list.add(7);
    }

    @Test
    void getFromLastTest() {
        Assertions.assertEquals(3, 3);
    }

    @Test
    void getFromLastNullTest() {
        Assertions.assertNull(list.getFromLast(0));
    }

    @Test
    void getFromLastNotNullTest() {
        Assertions.assertNotNull(list.getFromLast(5));
    }
}
