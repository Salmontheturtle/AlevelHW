package ua.masliy.hw5.task2test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.masliy.hw5.Task2;

public class Task2Testt {

    @Test
    public void testDescendingSort() {
        Assert.assertTrue(Task2.increaseCheck(new int[]{7, 6, 5, 4, 3, 2, 1}));
        Assert.assertTrue(Task2.increaseCheck(new int[]{5, 5, 5, 5, 5, 5, 5}));
        Assert.assertTrue(Task2.increaseCheck(new int[]{-1, -2, -3, -4, -5, -6, -7}));
    }

    @Test
    public void testSameNumbers() {
        Assert.assertTrue(Task2.increaseCheck(new int[]{0, 0, 0, 0, 0}));
        Assert.assertTrue(Task2.increaseCheck(new int[]{2, 2, 2, 2}));
        Assert.assertTrue(Task2.increaseCheck(new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    public void testOneNumber() {
        Assert.assertTrue(Task2.increaseCheck(new int[]{1}));
        Assert.assertTrue(Task2.increaseCheck(new int[]{23}));
        Assert.assertTrue(Task2.increaseCheck(new int[]{-7}));
    }

    @Test
    public void testNoNumbers() {
        Assert.assertTrue(Task2.increaseCheck(new int[0]));
    }

    @Test
    public void testAscendingSort() {
        Assert.assertFalse(Task2.increaseCheck(new int[]{1, 2, 3, 4, 5, 6, 7}));
        Assert.assertFalse(Task2.increaseCheck(new int[]{-9, -7, 0, 1, 2}));
        Assert.assertFalse(Task2.increaseCheck(new int[]{0, 0, 1}));
    }

    @Test
    public void testNoSort() {
        Assert.assertFalse(Task2.increaseCheck(new int[]{10, 4, 15}));
        Assert.assertFalse(Task2.increaseCheck(new int[]{0, -4, 14}));
        Assert.assertFalse(Task2.increaseCheck(new int[]{1, 1, -1, 20}));
    }
}
