package Threads;

public class Adder implements  Runnable{
    private Counter counter;
    private int value;

    public Adder(Counter counter, int value) {
        this.counter = counter;
        this.value = value;
    }

    @Override
    public void run() {
        counter.add(value);
    }
}
