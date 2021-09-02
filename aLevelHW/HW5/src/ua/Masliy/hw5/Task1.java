package ua.Masliy.hw5;

public class Task1 {

    public static void main(String[] args) {
        // write your code here
        int[][] ourArr = new int[10][10];
        positiveNegativeArrStrings(ourArr);
    }

    public static void positiveNegativeArrStrings(int[][] ourArr) {
        for (int i = 0; i < ourArr.length; i++) {
            for (int j = 0; j < ourArr[i].length; j++) {
                if (i % 2 == 0){
                    ourArr [i][j] = (int) (Math.random() * 10);
                } else {
                    ourArr[i][j] = (int) (Math.random() * 10 - (5 * 2));
                }
            }
        }


        for (int i = 0; i < ourArr.length; i++, System.out.println()) {
            for (int j = 0; j < ourArr[i].length; j++) {
                System.out.print(ourArr[i][j] + " ");
            }
        }
    }
}