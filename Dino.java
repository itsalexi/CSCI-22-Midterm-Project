import java.awt.*;
import java.awt.geom.*;

public class Dino extends DrawingObject{
    
    private static double width = 50; // temp value
    private static double height = 100; // temp value

    public Dino(double x, double y){
        super(x, y);
    }

    @Override
    public void drawElements(Graphics2D g2d){
        Hexagon h = new Hexagon(0, 0, 20, 20, Color.BLACK);
        h.draw(g2d);
    }

    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
}
