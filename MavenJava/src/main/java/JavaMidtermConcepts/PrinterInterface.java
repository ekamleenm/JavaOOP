package JavaMidtermConcepts;

import java.nio.DoubleBuffer;

public class PrinterInterface {


    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(21);
        printer.setThingToPrint();

        Printer<Double> p2 = new Printer<>(3.5);

        p2.setThingToPrint();
    }



}
