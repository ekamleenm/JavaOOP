package Threads;

public class Example {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Adder adder1 = new Adder(counter, 2);
        Adder adder2 = new Adder(counter, 3);
        Adder adder3 = new Adder(counter, 6);

        Thread thread1 = new Thread(adder1);
        Thread thread2 = new Thread(adder2);
        Thread thread3 = new Thread(adder3);

        thread1.start();
        System.out.println("After thread1.start");
        counter.report();
        thread2.start();
        System.out.println("After thread2.start");
        counter.report();
        thread3.start();
        System.out.println("After thread3.start");
        counter.report();


//        try {

//            thread1.join();
//            System.out.println("After thread1.Join so let thread1 finish.");
//            counter.report();
//            thread3.start();
//            System.out.println("After thread3.start");
//            counter.report();
//            thread3.join();
//            System.out.println("After thread3.Join so let thread3 finish.");
//            counter.report();
//            thread2.join();
//            System.out.println("After thread2.Join so let thread2 finish.");
//            counter.report();
//
//        } catch (InterruptedException e) {
//            System.err.println("An error occurred: " + e.getMessage());
//        }

//        counter.report();

    }
}
