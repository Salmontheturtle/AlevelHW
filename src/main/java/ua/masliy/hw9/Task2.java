package ua.masliy.hw9;

import java.util.Scanner;

public class    Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int pow = scanner.nextInt();
        Pow pow1 = () -> {
            int res = number;
            for (int i = 1; i < pow; i++) {
                res *= number;
            }
            return res;
        };
        System.out.println(pow1.pow());
    }
}
