package ua.masliy.hw16;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Date firstArrAddVar = new Date();
        oneMillionAdd(arrayList);
        Date secondArrAddVar = new Date();
        long finalArrAddTime = Math.abs(firstArrAddVar.getTime() - secondArrAddVar.getTime());
        System.out.println("Время затраченное на заполнение Array List равняется "
                + finalArrAddTime + " мс");

        Date firstLinkedAddVar = new Date();
        oneMillionAdd(linkedList);
        Date secondLinkedAddVar = new Date();
        long finalLinkedAddTime = Math.abs(firstLinkedAddVar.getTime() - secondLinkedAddVar.getTime());
        System.out.println("Время затраченное на заполнение Linked List равняется " +
                finalLinkedAddTime + " мс");

        Date firstArrGetVar = new Date();
        oneMillionAdd(arrayList);
        Date secondArrGetVar = new Date();
        long finalArrGetTime = Math.abs(firstArrGetVar.getTime() - secondArrGetVar.getTime());
        System.out.println("Время затраченное на выбор 1000000 элементов Array List равняется "
                + finalArrGetTime + " мс");

        Date firstLinkedGetVar = new Date();
        oneMillionAdd(linkedList);
        Date secondLinkedGetVar = new Date();
        long finalLinkedGetTime = Math.abs(firstLinkedGetVar.getTime() - secondLinkedGetVar.getTime());
        System.out.println("Время затраченное на выбор 1000000 элементов Linked List равняется "
                + finalLinkedGetTime + " мс");
    }

    static void oneMillionAdd(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random() * 100));
        }
    }

    static void oneMillionGet(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.get((int) (Math.random() * 999999));
        }
    }
}
