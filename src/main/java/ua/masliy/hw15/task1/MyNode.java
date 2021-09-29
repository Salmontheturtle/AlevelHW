package ua.masliy.hw15.task1;

public class MyNode<E> {
    E value;
    MyNode<E> next;
    MyNode<E> previous;

    MyNode(E value) {
        this.value = value;
    }
}
