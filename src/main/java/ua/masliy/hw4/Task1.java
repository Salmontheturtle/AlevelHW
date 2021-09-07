package ua.masliy.hw4;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
	// write your code here
        int [] primaryArray = new int[400];
        for (int i = 0; i < primaryArray.length; i++) {
            int randNumForPrimeArray = (int) (Math.random() * (11 - 1) + 1);
            primaryArray[i] = randNumForPrimeArray;
        }
        int [] primeArrCopy = Arrays.copyOf(primaryArray, primaryArray.length);
        averageArithmetical(primeArrCopy);
        averageGeometrical(primeArrCopy);
    }
    public static void averageArithmetical (int [] arithmeticalMean) {
        double arrayComponentsSum = 0;
        for (double j : arithmeticalMean) {
            arrayComponentsSum += j;
        }
        double finalResult = arrayComponentsSum / 400;
        System.out.println(arrayComponentsSum);
        System.out.println(finalResult);
    }
    public static void averageGeometrical (int [] geometricMean) {
        double arrayComponentMult = 1;
        for (int i = 0; i < geometricMean.length; i++) {
            arrayComponentMult *= geometricMean[i];
        }
        double finalResult = Math.pow(arrayComponentMult, 1.0/400);
        System.out.println(arrayComponentMult);
        System.out.println(finalResult);
    }
}
