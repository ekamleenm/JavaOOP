package Inheritance;

public class Main {

    public static void main(String[] args) {
        Box box = new Box();

        System.out.println(box.l);
        System.out.println(box.h);

        BoxChild boxChild = new BoxChild();
        System.out.println("Weight: " + boxChild.weight + "Length: "+ boxChild.l);
    }

}
