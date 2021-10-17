package ua.masliy.modules.module2.services;

import ua.masliy.modules.module2.exceptions.WrongStrValueException;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ShopService {

    public static void fileReader() {
        FileReader fr = null;
        try {
            fr = new FileReader("E:\\\\alevelHWMaven\\\\src\\\\main\\\\resources\\\\csvFile.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        String line = null;

        List<String> strings = new LinkedList<>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            strings.add(line);
            assert line != null;
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] == ',' && chars[i + 1] == ',') {
                    try {
                        throw new WrongStrValueException("There is no such value");
                    } catch (WrongStrValueException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
