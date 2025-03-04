
/**
 * The Player class represents the player's character  in the game.
 * It handles the player's movement, jumping, ducking, and collision detection.
 * The player also has a sprite for different states like running, jumping, and ducking.
 * 
 * @author Alexi Roth Luis A. Canamo (245333)
 * @author Kenaz R. Celestino (241051)
 * @version March 5, 2025
 * 
 * I have not discussed the Java language code in my program 
 * with anyone other than my instructor or the teaching assistants 
 * assigned to this course.
 * 
 * I have not used Java language code obtained from another student, 
 * or any other unauthorized source, either modified or unmodified.
 * 
 * If any Java language code or documentation used in my program 
 * was obtained from another source, such as a textbook or website, 
 * that has been clearly noted with a proper citation in the comments 
 * of my program.
 **/
import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import javax.sound.sampled.*;

public class Player extends DrawingObject {
  private double baseY;
  private double speed;
  private Dino sprite;
  private int runningDuration;
  private boolean isAlive, isDucking;

  /**
   * Constructs a Player object with the specified X and Y coordinates.
   * 
   * @param x the X-coordinate of the player's position
   * @param y the Y-coordinate of the player's position
   */
  public Player(double x, double y) {
    super(x, y);
    baseY = y;
    sprite = new Dino(0, 0);
    speed = 0;
    runningDuration = 0;
    isAlive = true;
    isDucking = false;
  }

  /**
   * Draws the player's sprite on the provided Graphics2D object.
   * 
   * @param g2d the Graphics2D object used for drawing
   */
  @Override
  public void drawElements(Graphics2D g2d) {
    sprite.draw(g2d);
  }

  /**
   * Makes the player jump if they are not currently jumping or ducking.
   */
  public void jump() {
    if (speed == 0 && this.getY() == baseY && !isDucking) {
      speed = 1337;
      sprite.setSprite(0);
      try {
        Clip clip = AudioSystem.getClip();
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("sfx/jump.wav").getAbsoluteFile());
        clip.open(inputStream);
        clip.start();
      } catch (Exception e) {
        System.out.println("Error playing sound");
      }
    }
  }

  /**
   * Updates the player's position and sprite based on the time.
   * Handles jumping, ducking and running
   * 
   * @param t the time interval
   */
  public void update(int t) {
    if (isAlive) {
      this.accelerate(-3000, t);
      this.setPosition(this.getX(), this.getY() - speed * t / 1000);
      runningDuration += t;
      if (isDucking) {
        sprite.setSprite(4 + (runningDuration / 100) % 2);
      } else {
        sprite.setSprite(1 + (runningDuration / 100) % 2);
      }
      if (this.getY() > baseY) {
        this.setPosition(this.getX(), baseY);
        speed = 0;
      } else {
        runningDuration = 0;
        sprite.setSprite(0);
      }
    }
  }

  /**
   * Accelerates the player's movement by a given amount over time.
   * 
   * @param a the acceleration to apply to the player's speed
   * @param t the time interval
   */
  public void accelerate(double a, int t) {
    speed += a * t / 1000;
  }

  /**
   * Returns the hitbox of the player
   * 
   * @return the hitbox of the player
   */
  public Rectangle2D getHitBox() {
    return new Rectangle2D.Double(this.getX(), this.getY() - sprite.getHeight(), sprite.getWidth() - 20,
        sprite.getHeight());
  }

  /**
   * Makes the player die, sets the sprite to the dead state, and plays the death
   * sound effect.
   */
  public void die() {
    isAlive = false;
    sprite.setSprite(3);
    try {
      Clip clip = AudioSystem.getClip();
      AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("sfx/die.wav").getAbsoluteFile());
      clip.open(inputStream);
      clip.start();
    } catch (Exception e) {
      System.out.println("Error playing sound");
    }
  }

  /**
   * Makes the player duck if they are not already ducking and are on the ground.
   */
  public void duck() {
    if (this.getY() == baseY && !isDucking) {
      sprite.setSprite(4);
      isDucking = true;
    }
    if (this.getY() != baseY) {
      speed -= 1000;
    }
  }

  /**
   * Makes the player stop ducking.
   */
  public void unDuck() {
    isDucking = false;
  }
}
