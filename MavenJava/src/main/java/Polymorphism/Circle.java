package Polymorphism;

public class Circle extends Shapes{
    void area(){
        System.out.println("Area = Pie*r*r");
    }
    // getting overriden
    public String toString(){
        return "Area = Pie*r*r";
    }
}
