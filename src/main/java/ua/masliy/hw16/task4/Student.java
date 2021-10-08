package ua.masliy.hw16.task4;

public class Student {
    private final String name;


    private final String surname;
    private final int course;
    private final double historyMark = (Math.random() * (5 - 1) + 1);
    private final double biologyMark = (Math.random() * (5 - 1) + 1);
    private final double physicsMark = (Math.random() * (5 - 1) + 1);
    private final double mathematicsMark = (Math.random() * (5 - 1) + 1);
    private final double englishMark = (Math.random() * (5 - 1) + 1);
    private final double chemistryMark = (Math.random() * (5 - 1) + 1);
    private final double averageMark = (getHistoryMark() + getBiologyMark() + getPhysicsMark() +
            getMathematicsMark() + getEnglishMark() + getChemistryMark()) / 6;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }


    public int getCourse() {
        return course;
    }


    public double getHistoryMark() {
        return historyMark;
    }


    public double getBiologyMark() {
        return biologyMark;
    }


    public double getPhysicsMark() {
        return physicsMark;
    }


    public double getMathematicsMark() {
        return mathematicsMark;
    }


    public double getEnglishMark() {
        return englishMark;
    }


    public double getChemistryMark() {
        return chemistryMark;
    }

    public String getSurname() {
        return surname;
    }

    public double getAverageMark() {
        return averageMark;
    }
}
