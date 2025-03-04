import java.awt.*;
import java.awt.geom.*;

public abstract class ParallaxObject extends DrawingObject{

    private double speed;
    private double time;

    public ParallaxObject(double x, double y, double s){
        super(x, y);
        speed = s;
        time = 0;
    }

    @Override
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(this.getX(), this.getY());
        drawElements(g2d);
        g2d.translate(800, 0);
        drawElements(g2d);
        g2d.setTransform(reset);
        if (this.getX() <= -800) {
            this.setPosition(0, this.getY());
        }
    }

    public abstract void drawElements(Graphics2D g2d);

    public double getSpeed(){
        return speed;
    }

    public void accelerate(double a, int t){
        speed += a * t / 1000;
    }

    public void update(int t){
        setPosition(this.getX() - speed * t / 1000, this.getY());
    }

    public void setTime(double t){
        time = t;
    }

    public double getTime(){
        return time;
    }
}