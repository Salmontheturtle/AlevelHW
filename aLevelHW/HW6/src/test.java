import java.time.LocalDate;
import java.util.Locale;

public class test {
    private String name;
    public static void main(String[] args) {
        printHello();
        printDate();
        printName();
    }
    public static void printHello() {
        System.out.println("Hello");
    }
    public static void printDate() {
        System.out.println(LocalDate.now());
    }
    public void printName() {
        System.out.println(name);
    }
}
