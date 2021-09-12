package ua.masliy.hw12;

import java.util.Optional;
import java.util.Scanner;

public class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String incomingNum = scanner.nextLine();
        if (findIndexByPhoneNumber(PHONE_BOOK, incomingNum).isPresent()) {
            System.out.println("Your number index is: " + findIndexByPhoneNumber(PHONE_BOOK, incomingNum).get());
        } else {
            System.out.println("Specified number is not on the list.");
        }
    }

    public static Optional<Integer> findIndexByPhoneNumber(String[] PHONE_BOOK, String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (phoneNumber.equals(PHONE_BOOK[i])) {
                return Optional.of(i);

            }
        }
        return Optional.empty();
    }
}
