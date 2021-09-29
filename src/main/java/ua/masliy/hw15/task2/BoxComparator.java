package ua.masliy.hw15.task2;

import java.util.Comparator;

public class BoxComparator implements Comparator<Box> {
    @Override
    public int compare(Box a, Box b) {
        if (a.getVolume() == 0 || b.getVolume() == 0) {
            if (a.getVolume() == 0) {
                return -1;
            }

            return 1;
        }
        return Integer.compare((int) b.getVolume(), (int) a.getVolume());
    }
}
