package ua.masliy.hw16.task4;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class DeansOffice {
    static List<Student> removeStudents(List<Student> list) {
        List<Student> listOfDeducted = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAverageMark() < 3/*list.get(i).getCourse() == 7*/) {
                System.out.println("Student " + list.get(i).getName() + " " + list.get(i).getSurname()
                        + " were deducted due to academical debts\nAverage mark: " + list.get(i).getAverageMark());
                list.remove(i);
                i--;
            }
        }
        return listOfDeducted;
    }

    static void printStudents(List<Student> list, int course) {
        System.out.println("Students from " + course + " course: ");
        for (Student student : list) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " " + student.getSurname());
            }
        }
    }

    static void nextCourseCheck(List<Student> list) {
        System.out.println("Students who finished year without debts and were moved to the next course: ");
        for (Student student : list) {
            if (student.getAverageMark() >= 3) {
                System.out.println(student.getName() + " " + student.getSurname());
            }
        }
    }

    static void allMarksCheck(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" ");
            System.out.println("MARKS OF " + list.get(i).getName().toUpperCase(Locale.ROOT) + ": ");
            System.out.println("Chemistry mark:");
            System.out.println(list.get(i).getChemistryMark());
            System.out.println("Mathematics mark:");
            System.out.println(list.get(i).getMathematicsMark());
            System.out.println("English mark:");
            System.out.println(list.get(i).getEnglishMark());
            System.out.println("Physics mark:");
            System.out.println(list.get(i).getPhysicsMark());
            System.out.println("Biology mark:");
            System.out.println(list.get(i).getBiologyMark());
            System.out.println("History mark:");
            System.out.println(list.get(i).getHistoryMark());
        }
    }
}
