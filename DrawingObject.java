import java.awt.*;

public abstract class DrawingObject {
  private double posX, posY;

  public abstract void draw(Graphics2D g2d);

  public DrawingObject(double x, double y) {
    posX = x;
    posY = y;
  }

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

}