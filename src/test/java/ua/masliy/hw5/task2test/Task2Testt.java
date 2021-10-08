package ua.masliy.hw5.task2test;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import ua.masliy.hw5.Task2;

public class Task2Testt {

    @Test
    public void testDescendingSort() {
        Assertions.assertTrue(Task2.increaseCheck(new int[]{7, 6, 5, 4, 3, 2, 1}));
        Assertions.assertTrue(Task2.increaseCheck(new int[]{5, 5, 5, 5, 5, 5, 5}));
        Assertions.assertTrue(Task2.increaseCheck(new int[]{-1, -2, -3, -4, -5, -6, -7}));
    }

    @Test
    public void testSameNumbers() {
        Assertions.assertTrue(Task2.increaseCheck(new int[]{0, 0, 0, 0, 0}));
        Assertions.assertTrue(Task2.increaseCheck(new int[]{2, 2, 2, 2}));
        Assertions.assertTrue(Task2.increaseCheck(new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    public void testOneNumber() {
        Assertions.assertTrue(Task2.increaseCheck(new int[]{1}));
        Assertions.assertTrue(Task2.increaseCheck(new int[]{23}));
        Assertions.assertTrue(Task2.increaseCheck(new int[]{-7}));
    }

    @Test
    public void testNoNumbers() {
        Assertions.assertTrue(Task2.increaseCheck(new int[0]));
    }

    @Test
    public void testAscendingSort() {
        Assertions.assertFalse(Task2.increaseCheck(new int[]{1, 2, 3, 4, 5, 6, 7}));
        Assertions.assertFalse(Task2.increaseCheck(new int[]{-9, -7, 0, 1, 2}));
        Assertions.assertFalse(Task2.increaseCheck(new int[]{0, 0, 1}));
    }

    @Test
    public void testNoSort() {
        Assertions.assertFalse(Task2.increaseCheck(new int[]{10, 4, 15}));
        Assertions.assertFalse(Task2.increaseCheck(new int[]{0, -4, 14}));
        Assertions.assertFalse(Task2.increaseCheck(new int[]{1, 1, -1, 20}));
    }
}
