package ua.masliy.hw12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите 1, пока не надоест: ");
        while (true) {
            int input = scanner.nextInt();
            if (input != 1) {
                try {
                    throw new Exception("Вы ввели не 1!");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Убеждаемся, девачки");
                }
            }
        }
    }
}
