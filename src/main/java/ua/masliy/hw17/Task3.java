package ua.masliy.hw17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> datesList = Arrays.asList("1111/06/06", "1293/11/14", "1111/02/08",
                "1995/05/11", "1824/10/20", "2021/06/28");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //LocalDate dateTime = LocalDate.parse(str, formatter);
        System.out.println(datesList
                .stream()
                .map(x -> LocalDate.parse(x, formatter))
                .anyMatch(y -> y.getYear() == 2021));
    }
}
