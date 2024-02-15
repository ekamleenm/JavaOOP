package Inheritance;

public class BoxChild extends Box {
    double weight;

    public BoxChild(){
        this.weight = -1;
    }
    public BoxChild(double l,double w,double h, double weight ){
                 super(l, h, w);
                 this.weight = weight;
    }
}
