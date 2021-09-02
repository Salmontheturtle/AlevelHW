package ua.Masliy.hw5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int [] ourArr = new int[10];
        System.out.println("Введите номер элемента, который вы хотите удалить от 1 до 10: ");
        Scanner scanner = new Scanner(System.in);
        int deletedElementNum = scanner.nextInt();
        for (int i = 0; i < ourArr.length; i++) {
            ourArr[i] = (int) (Math.random() * (10 - 1) + 1);
        }
        for (int j : ourArr) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
        arrNumDeleting(ourArr, deletedElementNum);
    }
    public static void arrNumDeleting (int [] ourArr, int deletedElementNum) {

        for (int i = deletedElementNum - 1; i < ourArr.length; i++) {
            ourArr[i] = ourArr[i + 1];
            if (i == ourArr.length - 2) {
                ourArr[ourArr.length - 1] = 0;
                break;
            }
        }
        for (int i = 0; i < ourArr.length; i++) {
            System.out.print(ourArr[i] + " ");
        }
    }
}
