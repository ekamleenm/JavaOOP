package JavaMidtermConcepts.BridgePattern;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle of  color Green with Radius,x,y: " + radius + " " +x + " "+y);
    }
}
