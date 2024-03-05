package JavaMidtermConcepts;

public class PrinterInterface {


    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(21);
        printer.setThingToPrint();

        Printer<Double> p2 = new Printer<>(3.5);

        p2.setThingToPrint();
        Shout("Hey", "Shaina");

    }


    private static <T,V> void Shout(T thingToShout, V PeopleToShoutAt){
        System.out.println(thingToShout+"!!!! " + PeopleToShoutAt);
    }

}
