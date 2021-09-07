package ua.Masliy.hw5;

public class Task3 {
    public static void main(String[] args) {
        //1 2 3 4 5
        //6 7 8 9 10
        //11 12 13 14 15
        //16 17 18 19 20
        //21 22 23 24 25
        int[][] ourArr = new int[5][5];
        for (int i = 0; i < ourArr.length; i++) {
            for (int j = 0; j < ourArr.length; j++) {
                ourArr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < ourArr.length; i++, System.out.println()) {
            for (int j = 0; j < ourArr[i].length; j++) {
                System.out.print(ourArr[i][j] + " ");
            }
        }
        System.out.println("  ");
        stringToColumn(ourArr);
    }
    public static void stringToColumn (int [][] ourArr) {
        int[][] twinArr = new int[ourArr[0].length][ourArr.length];

        for(int i=0; i < ourArr.length; i++) {
            for(int j=0; j < ourArr[i].length; j++) {
                twinArr[j][i] = ourArr[i][j];
            }
        }
        for (int i = 0; i < twinArr.length; i++, System.out.println()) {
            for (int j = 0; j < twinArr[i].length; j++) {
                System.out.print(twinArr[i][j] + " ");
            }
        }
    }
}