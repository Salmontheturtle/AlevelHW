package ua.Masliy.hw5;

public class Task2 {
    public static void main(String[] args) {
        int [] incrementOrderliness = new int[5];
        for (int i = 0; i < incrementOrderliness.length; i++) {
            incrementOrderliness [i] = ((int) (Math.random() * 10));
            System.out.print(incrementOrderliness[i] + " ");
        }
        if (increaseCheck(incrementOrderliness)==true){
            System.out.println("Наш массив упорядочен по невозрастанию!");
        } else {
            System.out.println("Наш массив не упорядочен по невозрастанию!");
        }
    }
    public static boolean increaseCheck (int [] ourArr) {
        for (int i = 0; i < ourArr.length - 1; i++) {
            if (ourArr[i] < ourArr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
