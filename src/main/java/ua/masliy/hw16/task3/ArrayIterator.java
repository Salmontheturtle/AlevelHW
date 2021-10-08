package ua.masliy.hw16.task3;

import java.util.NoSuchElementException;

public class ArrayIterator<E> {
    private final E[] array;
    private int index;

    public ArrayIterator(E[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        return index < array.length;
    }

    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return array[index++];
    }

    public void remove(int index) {
        //E arrLastValue = array[array.length - 1];
        array[array.length - 1] = null;
        for (int i = index; i < array.length - 1; i++) {
            array[index] = array[index + 1];
        }
        for (E e : array) {
            System.out.println(e);
        }
    }
}
