package ua.masliy.modules.module2.services;

import ua.masliy.modules.module2.objects.Customer;

import java.util.Random;

public class PersonService {

    public Customer personGenerator() {
        int emailLength = (int) (Math.random() * (16 - 5) + 5);
        int age = (int) (Math.random() * (99 - 18) + 18);
        return new Customer((int) (Math.random() * (100 - 1) + 1),
                getRandomString(emailLength),
                age);
    }

    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();

    }
}
