package ua.masliy.hw7;

public class Aspirant extends Student {
    public boolean studyPresence = true;

    public Aspirant(String firstName, String lastName, String group, double averageMark, boolean studyPresence) {
        super(firstName, lastName, group, averageMark);
        this.studyPresence = studyPresence;
    }

    @Override
    public int getScholarship() {
        int scholarship;
        if (averageMark == 5) {
            scholarship = 200;
        } else scholarship = 180;
        return scholarship;
    }
}
