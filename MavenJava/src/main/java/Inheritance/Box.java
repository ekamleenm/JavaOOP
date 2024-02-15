package Inheritance;

public class Box {
    double l;
    double h;
    double w;
    // Default Constructor
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // Cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    // Cuboid
    public Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // Copy constructor
    Box(Box oldBox){
        this.h = oldBox.h;
        this.l = oldBox.l;
        this.w = oldBox.w;
    }

    public void displayInfo() {
        System.out.println("Running the Box class ");
    }
}
