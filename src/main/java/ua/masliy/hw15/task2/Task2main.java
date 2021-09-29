package ua.masliy.hw15.task2;

import java.util.TreeSet;

public class Task2main {
    public static void main(String[] args) {
        BoxComparator boxComparator = new BoxComparator();
        TreeSet<Box> treeSet = new TreeSet<>(boxComparator);
        treeSet.add(new Box(4));
        treeSet.add(new Box(2));
        treeSet.add(new Box(0));
        treeSet.add(new Box(1));
        treeSet.add(new Box(9));
        for (Box box : treeSet) {
            System.out.println(box.getVolume());
        }
    }
}
