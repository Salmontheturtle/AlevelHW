package ua.masliy.hw16.task4;

import java.util.LinkedList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Student> studentsList = new LinkedList<>();
        studentsList.add(new Student("Geralt", "Of Rivia", 5));
        studentsList.add(new Student("Letho", "Of Gulet", 3));
        studentsList.add(new Student("Erland", "Of Larvik", 1));
        studentsList.add(new Student("George", "Of Kagen", 4));
        studentsList.add(new Student("Jad", "Karadin", 2));
        studentsList.add(new Student("Dermot", "Marranga", 6));

        DeansOffice.printStudents(studentsList, 4);
        System.out.println(" ");
        DeansOffice.removeStudents(studentsList);
        System.out.println(" ");
        DeansOffice.nextCourseCheck(studentsList);
        System.out.println(" ");
        DeansOffice.allMarksCheck(studentsList);
    }
}

