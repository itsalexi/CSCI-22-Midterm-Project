
/**
 * The ParallaxObject class represents an object in a parallax scrolling system.
 * It handles the object's position, speed, and time updates. It also extends DrawingObject.
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

public abstract class ParallaxObject extends DrawingObject {

  private double speed;
  private double time;

  /**
   * Constructs a ParallaxObject with the specified position and speed.
   * 
   * @param x the X-coordinate of the object
   * @param y the Y-coordinate of the object
   * @param s the speed at which the object moves
   */
  public ParallaxObject(double x, double y, double s) {
    super(x, y);
    speed = s;
    time = 0;
  }

  /**
   * Draws the object and its repeating parallax effect on the provided Graphics2D
   * object.
   * 
   * @param g2d the Graphics2D object used for drawing
   */
  @Override
  public void draw(Graphics2D g2d) {
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

  /**
   * Returns the speed of the object.
   * 
   * @return the speed of the object
   */
  public double getSpeed() {
    return speed;
  }

  /**
   * Accelerates the movement speed of the objects
   * 
   * @param a the acceleration to apply to the speed
   * @param t the time interval
   */
  public void accelerate(double a, int t) {
    speed += a * t / 1000;
  }

  /**
   * Updates the object's position based on its current speed and the time
   * interval.
   * 
   * @param t the time interval
   */
  public void update(int t) {
    setPosition(this.getX() - speed * t / 1000, this.getY());
  }

  /**
   * Sets the time for the object
   * 
   * @param t the time value
   */
  public void setTime(double t) {
    time = t;
  }

  /**
   * Returns the current time for the object.
   * 
   * @return the current time of the object
   */
  public double getTime() {
    return time;
  }
}