package ua.masliy.hw16.task3;

public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(arr);
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
        //arrayIterator.remove(4);
    }
}
