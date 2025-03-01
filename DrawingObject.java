import java.awt.*;

public abstract class DrawingObject {
  private double posX, posY, speed;
  private boolean isParallax;

  public DrawingObject(double x, double y){
    posX = x;
    posY = y;
    speed = 0;
    isParallax = false;
  }

  public DrawingObject(double x, double y, double s) {
    posX = x;
    posY = y;
    speed = s;
    isParallax = true;
  }

  public abstract void draw(Graphics2D g2d);

  public void drawElements(Graphics2D g2d){
    if(isParallax){
      draw(g2d);
      g2d.translate(800, 0);
      draw(g2d);
      posX -= speed;
      if (posX <= -800) {
        posX = 0;
      }
    } else {
      draw(g2d);
    }
  }

  public double getX() {
    return posX;
  }

  public double getY() {
    return posY;
  }

  public double getSpeed(){
    return speed;
  }

  public void accelerate(double a){
    speed += a;
  }

  public void setPosition(double x, double y) {
    posX = x;
    posY = y;
  }

}