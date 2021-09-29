package ua.masliy.hw15.task1;

public class MyList<E> {
    private MyNode<E> head;
    private MyNode<E> tail;
    private int size = 0;

    public void add(E value) {
        MyNode<E> node = new MyNode<>(value);
        if (head != null) {
            MyNode<E> next = head.next;
            if (next == null) {
                head.next = node;
                node.previous = head;
            } else {
                while (next.next != null) {
                    next = next.next;
                }
                next.next = node;
                node.previous = next;
            }
        } else if (head == null) {
            head = node;
        }
        tail = node;
        size++;
    }
    public E getFromLast(E value){
        if (tail == head) {
            return tail.value;
        }
        MyNode<E> nodeLast = tail;
        for (int i = 0; i < size; i++) {
            if (nodeLast.value == value) {
                return nodeLast.value;
            }
            nodeLast = nodeLast.previous;
        }
        return null;
    }
}
