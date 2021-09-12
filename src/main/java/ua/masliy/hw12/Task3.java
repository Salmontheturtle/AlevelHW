package ua.masliy.hw12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws SecondException, FirstException, ThirdException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to get an exception: ");
        int incomingNumber = scanner.nextInt();
        try {
            ThrowThreeExceptions.ThreeExceptionsThrow(incomingNumber);
        } catch (SecondException | FirstException | ThirdException exception) {
            exception.printStackTrace();
        }
    }
}

class FirstException extends Exception {
    FirstException(String msg) {
        super(msg);
    }
}

class SecondException extends Exception {
    SecondException(String msg) {
        super(msg);
    }
}

class ThirdException extends Exception {
    ThirdException(String msg) {
        super(msg);
    }
}
