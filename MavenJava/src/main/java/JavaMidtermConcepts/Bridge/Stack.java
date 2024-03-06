package JavaMidtermConcepts.Bridge;

public class Stack<T> {
    private StackImpl<T> implementation;

    public Stack(StackType type) {
        switch (type) {
            case LINKED_LIST:
                implementation = new LinkedListBasedStack<>();
                break;
            case ARRAY:
            default:
                implementation = new ArrayBasedStack<>();
                break;
        }
    }

    public void push(T item) {
        implementation.push(item);
    }

    public T pop() {
        return implementation.pop();
    }
}
