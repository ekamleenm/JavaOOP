package AccessMod;

public class Main {
    public static void main(String[] args) {
         A shaina = new A(10,"shaina");
         /* Need to do a few things
           > Access the data members
           > Modify the data members
         */
        // System.out.println(obj.num); Can't access directly.
        System.out.println(shaina.getName());
    }
}

/*
  No Modifier : Not outside the Particular Package.
  Protected : Only outside if its in subclass. We need to make
  object of subclass(Child class) not the parent class in diff package.
  Parent class can't access it. Note: even of SubSubClass we can access it
*/