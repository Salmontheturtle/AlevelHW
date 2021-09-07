package ua.masliy.hw7;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        int scholarship;
        if (averageMark == 5) {
            scholarship = 100;
        } else scholarship = 80;
        return scholarship;
    }
}
