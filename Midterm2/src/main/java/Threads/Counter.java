package Threads;

public class Counter {
    private long count = 0;

    public synchronized void add(long value) {
        // Synchronized to prevent concurrent modification errors
        long temp = count + value;
        count = temp;
    }

    public void report() {
        System.out.println("Count = " + count);
    }
}
