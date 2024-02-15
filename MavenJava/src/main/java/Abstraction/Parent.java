package Abstraction;

public abstract class Parent {
    abstract void career(String name);
    abstract void partner(String name, int age);

    /* We can't create abstract static methods; bc they can't get overriden
     what is the point. But we can create normal static methods or other
     methods. Other normal methods as well. But the abstract methods needs
     to be overriden. */
}
