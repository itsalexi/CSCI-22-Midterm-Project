import java.awt.*;
import java.awt.geom.*;

public class Player extends DrawingObject{

  private double speedY = 0;
  private Dino sprite;

  public Player(double x, double y) {
    super(x, y);
    sprite = new Dino(x, y);
  }

  @Override
  public void draw(Graphics2D g2d){

    sprite.draw(g2d);
  }

  public void jump(){

  }

  public void update() {
    speedY *= 0.99;
  }

  public void accelerate(double accelerationX, double accelerationY) {
    speedY += accelerationY;
  }

  public void setSpeedY(double y) {
    speedY = y;
  }

}
