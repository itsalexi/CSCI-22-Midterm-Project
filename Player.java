import java.awt.*;
import java.awt.geom.*;

public class Player extends DrawingObject{
  private double baseY;
  private double speedY;
  private Dino sprite;

  public Player(double x, double y) {
    super(x, y);
    baseY = y;
    sprite = new Dino(x, y);
    speedY = 0;
  }

  @Override
  public void draw(Graphics2D g2d){

    sprite.draw(g2d);
  }

  public void jump(){
    if (this.getY() < baseY - sprite.getHeight()) {
      this.accelerate(-GameCanvas.GRAVITY);
    }
    this.update();
    if (this.getY() > baseY) {
      this.setPosition(this.getY(), baseY - sprite.getHeight());
      this.setSpeedY(0);
    }
  }

  public void update() {
    speedY *= 0.99;
  }

  public void accelerate(double accelerationY) {
    speedY += accelerationY;
  }

  public void setSpeedY(double y) {
    speedY = y;
  }

}
