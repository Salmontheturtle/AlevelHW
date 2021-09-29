package ua.masliy.hw15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import ua.masliy.hw15.task2.Box;
import ua.masliy.hw15.task2.BoxComparator;

import java.util.Set;
import java.util.TreeSet;

public class Hw15Task2 {
    Set<Box> boxSet;
    Box box1;
    Box box2;
    Box box3;
    Box box4;
    Box box5;
    BoxComparator boxComparator;

    @BeforeEach
    void setBoxSet() {
        box1 = new Box(1);
        box2 = new Box(0);
        box3 = new Box(-6);
        box4 = new Box(100);
        box5 = new Box(0);
        boxSet = new TreeSet<>(new BoxComparator());
        boxComparator = new BoxComparator();
    }

    @Test
    void zeroZeroBoxesCompare() {
        Assert.assertEquals(0, boxComparator.compare(box2, box5));
    }

    @Test
    void negativeNumNumBoxesCompare() {
        Assert.assertEquals(-7, boxComparator.compare(box3, box1));
    }
    @Test
    void sameBoxesCompare(){
        Assert.assertEquals(0, boxComparator.compare(box4, box4));
    }

}
