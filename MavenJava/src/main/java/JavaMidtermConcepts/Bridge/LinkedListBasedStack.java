package JavaMidtermConcepts.Bridge;

public class LinkedListBasedStack<T> implements StackImpl<T> {
    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> tail;

    public void push(T item) {
        if (tail == null) {
            tail = new Node<>(item);
        } else {
            tail.next = new Node<>(item);
            tail.next.prev = tail;
            tail = tail.next;
        }
    }

    public T pop() {
        if (tail == null) {
            return null;
        }
        T result = tail.value;
        tail = tail.prev;
        return result;
    }
}
