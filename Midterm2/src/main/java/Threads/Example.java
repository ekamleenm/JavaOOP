package Threads;

public class Example {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Adder adder1 = new Adder(counter, 2);
        Adder adder2 = new Adder(counter, 3);

        Thread thread1 = new Thread(adder1);
        Thread thread2 = new Thread(adder2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        counter.report();
    }
}
