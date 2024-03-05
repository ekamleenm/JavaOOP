package JavaMidtermConcepts;

public class PrinterInterface {


    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(21);
        printer.setThingToPrint();

        Printer<Double> p2 = new Printer<>(3.5);

        p2.setThingToPrint();
        Shout("Hey");
        Shout("Shaina");
    }


    private static <T> void Shout(T thingToShout){
        System.out.println(thingToShout+"!!!!");
    }

}
