import java.awt.*;
import java.awt.geom.*;

public abstract class DrawingObject {
  private double posX, posY;

  public DrawingObject(double x, double y){
    posX = x;
    posY = y;
  }

  public void draw(Graphics2D g2d){
    AffineTransform reset = g2d.getTransform();
    g2d.translate(posX, posY);
    drawElements(g2d);
    g2d.setTransform(reset);
  }

  public abstract void drawElements(Graphics2D g2d);

  public double getX() {
    return posX;
  }

  public double getY() {
    return posY;
  }

  public void setPosition(double x, double y) {
    posX = x;
    posY = y;
  }

  public void update(int t){}

}