package Polymorphism;
// Using general thing for multiple specific things
public class Main {
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        // Every object can override toString() method of the object class
        // So we can use that when we just print the reference var name
        shape.area();
        System.out.println(circle);
        square.area();
    }
}
// We can put final inorder to avoid Overriding any method +
// to stop class getting inheritted