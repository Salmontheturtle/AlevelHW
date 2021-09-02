package ua.Masliy.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int [] primaryArr = new int[2000];
        for (int i = 0; i < primaryArr.length; i++) {
            int rndArrNum = (int) (Math.random() * (101 - 1) + 1);
            primaryArr[i] = rndArrNum;
        }
        int [] primeArrCopy = Arrays.copyOf(primaryArr, primaryArr.length);
        evenToZero(primeArrCopy);
        for (int i = 0; i < primeArrCopy.length; i++) {
            System.out.println(primeArrCopy[i]);
        }
    }
    public static void evenToZero (int [] e2zVar) {
        for (int i = 0; i < e2zVar.length; i++) {
           // int evenFinder = e2zVar[i]; //если делать через такую переменную, то не работает, почему - хз
            if (e2zVar[i] % 2 == 0) {
                e2zVar[i] = 0;
            }
        }
    }
}
