import java.awt.*;
import java.awt.geom.*;

public class Sun extends DrawingObject{

    private double width, height;
    private float alpha;

    public Sun(double x, double y, double w, double h){
        super(x, y);
        width = w;
        height = h;
        alpha = 1;
    }

    private AlphaComposite makeComposite(float alpha) {
        int type = AlphaComposite.SRC_OVER;
        return(AlphaComposite.getInstance(type, alpha));
    }

    public void drawElements(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        Composite originaComposite = g2d.getComposite();
        Hexagon hexagon = new Hexagon(0, 0, width, height, new Color(255, 245, 133));
        Triangle triangle = new Triangle(0, -height / 6, width, height, new Color(255, 245, 133));
        g2d.setComposite(makeComposite(alpha));
        hexagon.draw(g2d);
        g2d.rotate(Math.toRadians(30), width / 2, height / 2);
        triangle.draw(g2d);
        for(int i = 0; i < 5; i++){
            g2d.rotate(Math.toRadians(60), width / 2, height / 2);
            triangle.draw(g2d);
        }
        g2d.setTransform(reset);
        g2d.setComposite(originaComposite);
    }

    public void setAlpha(double a){
        alpha = (float) a;
    }
}
