import java.awt.*;
import java.awt.geom.*;

public class Player extends DrawingObject{
  private double baseY;
  private double speed;
  private Dino sprite;

  public Player(double x, double y) {
    super(x, y);
    baseY = y;
    sprite = new Dino(0, 0);
    speed = 0;
  }

  @Override
  public void drawElements(Graphics2D g2d){
    sprite.draw(g2d);
  }

  public void jump(){
    if(speed == 0 && this.getY() == baseY){
      speed = 500;
    }
  }

  public void update(int t) {
    this.accelerate(-1000, t);
    this.setPosition(this.getX(), this.getY() - speed * t / 1000);
    if(this.getY() > baseY){
      this.setPosition(this.getX(), baseY);
      speed = 0;
    }
  }

  public void accelerate(double a, int t) {
    speed += a * t / 1000;
  }

  public Rectangle2D getHitBox(){
    return new Rectangle2D.Double(this.getX(), this.getY(), Dino.getWidth(), Dino.getHeight());
  }

}
