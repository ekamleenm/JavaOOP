package JavaMidtermConcepts;

// Generic doesn't work with primitive data types.

public class Printer <T>{

    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void setThingToPrint(){
        System.out.println(this.thingToPrint);
    }

}

