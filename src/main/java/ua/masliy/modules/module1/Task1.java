package ua.masliy.modules.module1;

public class Task1 {

    public static void main(String[] args) {
        // write your code here
        int[] ourArr = {1, 4, 5, 1, 1, 3, 1, 6, 7, 8, 1341, 1341};
        for (int i = 0; i < ourArr.length; i++) {
            System.out.print(ourArr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Количество уникальных элементов в массиве = " + arrUniqueElements(ourArr));
    }

    public static int arrUniqueElements(int[] ourArr) {
        int uniqueCounter = 0;
        int generalCounter = 0;
        for (int i = 0; i < ourArr.length; i++) {
            uniqueCounter++;
            for (int j = i + 1; j < ourArr.length; j++) {
                if (ourArr[i] == ourArr[j]) {
                    generalCounter++;
                    break;
                }
            }
        }
        return uniqueCounter - generalCounter;
    }
}