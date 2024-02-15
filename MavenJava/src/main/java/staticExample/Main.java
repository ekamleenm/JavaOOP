package staticExample;

public class Main {
    // Most common static method.
    public static void main(String[] args) {
        Human shaina = new Human(21, "shaina", 1000, false);
        Human ekam = new Human(21, "Ekamleen", 900, false);
        Human sabrina = new Human(25, "sab", 1222, true);
        System.out.println(ekam.age);
        System.out.println(ekam.married);
        System.out.println(Human.population);  // Human is a static variable

        greeting(); // Static method can only access static data, yk the non static data
        // belongs to an object.

        // If you want to call non static methods from static method
        Main obj = new Main();
        obj.nonStatic2();

    }

    // E.g.
    static void fun() {
//        nonStatic(); this call gives error b/c static methods are called without
//         objects and when you call non static method insdie of static method, how are you going to
//        call it without an object.
    }

    static void greeting() {
        System.out.println("this is me.");
    }

    void nonStatic2() {
        nonStatic();  // we can call this
    }

    void nonStatic() {
        System.out.println("Yeah Now i am called");
    }

}

/*
Static method can only access static data, yk the non static data belongs to an object.
 nonStatic(); this call gives error b/c static methods are called without
 objects and when you call non static method insdie of static method, how are you going to
 call it without an object. We can't use this in static method. Be careful
*/