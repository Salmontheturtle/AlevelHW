package ua.masliy.modules.module1;

import java.util.Scanner;

public class ModuleTask2 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Введите изначальные координаты коня от 1 до 8 ");
        Scanner scanner = new Scanner(System.in);
        int knightCoord1 = scanner.nextInt();
        int knightCoord2 = scanner.nextInt();
        System.out.println("Введите координаты передвижения коня от 1 до 8 ");
        int knightMove1 = scanner.nextInt();
        int knightMove2 = scanner.nextInt();
        System.out.println(stepPossibilityCheck(knightCoord1, knightCoord2, knightMove1, knightMove2));

    }
    public static String stepPossibilityCheck (int a, int b, int c, int d) {
        if (a == (c + 2) && b == (d - 1)){
            return "Вы успешно передвинули коня на 2 клетки вверх и одну вправо!";
        } else if (a == (c + 2) && b == (d + 1)) {
            return "Вы успешно передвинули коня на 2 клетки вверх и одну влево!";
        } else if (a == (c - 2) && b == (d - 1)) {
            return "Вы успешно передвинули коня на 2 клетки вниз и одну вправо!";
        } else if (a == (c - 2) && b == (d + 1)) {
            return "Вы успешно передвинули коня на 2 клетки вверх и одну влево!";
        } else if (a == (c + 1) && b == (d - 2)) {
            return "Вы успешно передвинули коня на 2 клетки вправо и одну вверх!";
        } else if (a == (c - 1) && b == (d - 2)){
            return "Вы успешно передвинули коня на 2 клетки вправо и одну вниз!";
        } else if (a == (c - 1) && b == (d + 2)) {
            return "Вы успешно передвинули коня на 2 клетки влево и одну вниз!";
        } else if (a == (c + 1) && b ==(d + 2)){
            return "Вы успешно передвинули коня на 2 клетки вниз и одну вверх!";
        } else return "Конь не может быть сюда передвинут!";
    }
}
