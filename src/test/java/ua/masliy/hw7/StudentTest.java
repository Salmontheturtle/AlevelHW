package ua.masliy.hw7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {
    @Test
    public void studentScholarshipTest() {
        Student student1 = new Student("", "", "", 0);
        Student student2 = new Student("", "", "", 1);
        Student student3 = new Student("", "", "", 5);
        Student student4 = new Student("", "", "", 10);
        Student student5 = new Student("", "", "", -5);
        Assert.assertEquals(80, student1.getScholarship());
        Assert.assertEquals(80, student2.getScholarship());
        Assert.assertEquals(100, student3.getScholarship());
        Assert.assertEquals(80, student4.getScholarship());
        Assert.assertEquals(80, student5.getScholarship());
    }
}
