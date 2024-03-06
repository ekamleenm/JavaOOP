package JavaMidtermConcepts.Bridge;

public class Client {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(StackType.ARRAY);
        stack.push("foo");
        stack.push("bar");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
