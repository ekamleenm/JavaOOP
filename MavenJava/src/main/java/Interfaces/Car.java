package Interfaces;

public class Car implements Engine, Brake{

    public void Brake() {
        System.out.println("i brake like a normal car");
    }

    public void start() {
        System.out.println("i start like a normal car");
    }

    public void stop() {
        System.out.println("I stop like a normal car");
    }

    public void accelerate() {
        System.out.println("I accelarate like a normal car");
    }
}
