package ua.masliy.hw7;

public class Task2 {

    public static void main(String[] args) {
        // write your code here
        Student student1 = new Student("Вова", "Матюшко", "47ДУ", 2.3);
        Student student2 = new Student("Александр", "Яичко", "46УМ", 5);
        Aspirant aspirant1 = new Aspirant("Никита", "Маслий", "54АК", 5, true);
        Aspirant aspirant2 = new Aspirant("Евгений", "Палочкин", "поддержки", 4.7, true);
        Student students[] = {student1, student2, aspirant1, aspirant2};
        for (Student student : students) {
            System.out.println("Имя студента: " + student.firstName + ". Фамилия студента: " + student.lastName + ". Группа студента: " + student.group +
                    ". Стипендия равна " + student.getScholarship() + " грн.");
        }

    }
}
