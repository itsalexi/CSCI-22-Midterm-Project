import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import javax.sound.sampled.*;

public class Player extends DrawingObject{
  private double baseY;
  private double speed;
  private Dino sprite;
  private int runningDuration;
  private boolean isAlive;

  public Player(double x, double y) {
    super(x, y);
    baseY = y;
    sprite = new Dino(0, 0);
    speed = 0;
    runningDuration = 0;
    isAlive = true;
  }

  @Override
  public void drawElements(Graphics2D g2d){
    sprite.draw(g2d);
  }

  public void jump(){
    if(speed == 0 && this.getY() == baseY){
      speed = 500;
      sprite.setSprite(0);
      try{
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("sfx/jump.wav").getAbsoluteFile());
          clip.open(inputStream);
          clip.start();
      } catch (Exception e){
          System.out.println("Error playing sound");
      }
    }
  }

  public void update(int t) {
    if(!isAlive){
      sprite.setSprite(3);
    } else{ 
      this.accelerate(-1000, t);
      this.setPosition(this.getX(), this.getY() - speed * t / 1000);
      runningDuration += t;
      sprite.setSprite(1 + (runningDuration / 100) % 2);
      if(this.getY() > baseY){
        this.setPosition(this.getX(), baseY);
        speed = 0;
      } else {
        runningDuration = 0;
        sprite.setSprite(0);
      }
    }
  }

  public void accelerate(double a, int t) {
    speed += a * t / 1000;
  }

  public Rectangle2D getHitBox(){
    return new Rectangle2D.Double(this.getX(), this.getY(), sprite.getWidth(), sprite.getHeight());
  }

  public void die(){
    isAlive = false;
    try{
      Clip clip = AudioSystem.getClip();
      AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("sfx/die.wav").getAbsoluteFile());
      clip.open(inputStream);
      clip.start();
    } catch (Exception e){
        System.out.println("Error playing sound");
    }
  }

}
