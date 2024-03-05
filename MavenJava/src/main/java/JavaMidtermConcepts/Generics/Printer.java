package JavaMidtermConcepts.Generics;

// Generic doesn't work with primitive data types.
// we can also <T extends Animal> and we can make ArrayList<Cat>
// we can also use the methods of Animal class.

public class Printer <T>{

    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void setThingToPrint(){
        System.out.println(this.thingToPrint);
    }


}

