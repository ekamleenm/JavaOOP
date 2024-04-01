package ExceptionHandling;

// Example class demonstrating the use of try, catch, and finally blocks
public class MyClass {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            System.out.println("finished"); // This block gets executed regardless of exception occurrence
        }
    }
}
