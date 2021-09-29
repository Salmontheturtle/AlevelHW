package ua.masliy.hw15.task2;

import java.util.Comparator;

public class BoxComparator implements Comparator<Box> {
    @Override
    public int compare(Box a, Box b) {
        return (int) (a.getVolume() - b.getVolume());
    }
}
