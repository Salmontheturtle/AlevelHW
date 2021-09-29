package ua.masliy.hw15.task1;

public class Task1 {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
            //myList.add(-7);
            myList.add(99);
            myList.add(-5);
            myList.add(31);
            myList.add(0);
            myList.add(null);
        System.out.println(myList.getFromLast(0));
        System.out.println(myList.getFromLast(99));
        System.out.println(myList.getFromLast(-7));
        System.out.println(myList.getFromLast(null));
    }
}
