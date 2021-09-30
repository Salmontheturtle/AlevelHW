package ua.masliy.hw7;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AspirantTest {
    @Test
    public void testGetScholarshipIntegerNumbers() {
        Student student1 = new Student("", "", "", 0);
        Student student2 = new Student("", "", "", 1);
        Student student3 = new Student("", "", "", 5);
        Student student4 = new Student("", "", "", 10);
        Student student5 = new Student("", "", "", -5);
        Assertions.assertEquals(80, student1.getScholarship());
        Assertions.assertEquals(80, student2.getScholarship());
        Assertions.assertEquals(100, student3.getScholarship());
        Assertions.assertEquals(80, student4.getScholarship());
        Assertions.assertEquals(80, student5.getScholarship());
    }
}
