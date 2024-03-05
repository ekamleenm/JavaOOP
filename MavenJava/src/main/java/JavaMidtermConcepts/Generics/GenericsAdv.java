package JavaMidtermConcepts.Generics;

import org.w3c.dom.ls.LSOutput;

public class GenericsAdv <T,V> {
    T thingToSay;
    V personToSay;

    public GenericsAdv(T thingToSay,V personToSay){
       this.personToSay = personToSay;
       this.thingToSay = thingToSay;
    }
    public void LetsDoIt(){
        System.out.println("Hey " + this.personToSay + "I just wanted to tell you that " + this.thingToSay + ".");
    }
}
