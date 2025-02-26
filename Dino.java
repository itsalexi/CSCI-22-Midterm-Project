import java.awt.*;
import java.awt.geom.*;

public class Dino extends DrawingObject{
    
    private static double width = 50; // temp value
    private static double height = 100; // temp value

    public Dino(double x, double y){
        super(x, y);
    }

    @Override
    public void draw(Graphics2D g){

    }

    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
}
