package ua.masliy.hw12;

import java.io.EOFException;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws EOFException {
        f();
    }
    static void f() throws EOFException {
        try {
            g();
        } catch (IOException e) {
            throw new EOFException("Исключение f2");
        }
    }

    static void g() throws IOException {
        throw new IOException("Исключение g1");
    }
}
