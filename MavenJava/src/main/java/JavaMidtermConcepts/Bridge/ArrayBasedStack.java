package JavaMidtermConcepts.Bridge;

public class ArrayBasedStack<T> implements StackImpl<T> {
    private static final int MAX_SIZE = 100;
    private final T[] elements;
    private int size = -1;

    public ArrayBasedStack() {
        elements = (T[]) new Object[MAX_SIZE];
    }

    public void push(T item) {
        if (size < MAX_SIZE - 1) {
            elements[++size] = item;
        }
    }

    public T pop() {
        if (size == -1) {
            return null;
        }
        return elements[size--];
    }
}
