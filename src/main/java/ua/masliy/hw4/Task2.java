package ua.masliy.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] primaryArray = new int[1000];
        for (int i = 0; i < primaryArray.length; i++) {
            int randNumForPrimeArray = (int) (Math.random() * (101 - 1) + 1);
            primaryArray[i] = randNumForPrimeArray;
        }
        int[] primeArrCopy = Arrays.stream(primaryArray).toArray();
        simplnessCheck(primeArrCopy);
    }
    public static void simplnessCheck (int [] ourArr) {
        int simpleNumCounter = 0;
        for (int i = 1; i < ourArr.length; i++) {
            int inArrNum = ourArr[i];
            for (int j = 0; j <= inArrNum/2; j++) {
                int temp = inArrNum % i;
                if (temp == 0) {
                    simpleNumCounter++;
                    break;
                }
            }
        }
        System.out.println(simpleNumCounter);
    }
}