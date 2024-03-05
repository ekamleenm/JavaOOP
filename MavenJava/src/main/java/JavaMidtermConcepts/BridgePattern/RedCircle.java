package JavaMidtermConcepts.BridgePattern;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle of  color Red with Radius,x,y: " + radius + " " +x + " "+y);
    }
}
