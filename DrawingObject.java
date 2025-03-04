
/**
 * The DrawingObject class represents an abstract drawable object 
 * It provides methods to set position, update state, and draw the object
 * using a Graphics2D context.
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
 */
import java.awt.*;
import java.awt.geom.*;

public abstract class DrawingObject {
  private double posX, posY;

  /**
   * Constructs a DrawingObject with the specified position.
   * 
   * @param x the X-coordinate of the object
   * @param y the Y-coordinate of the object
   */
  public DrawingObject(double x, double y) {
    posX = x;
    posY = y;
  }

  /**
   * Draws the object using a Graphics2D context.
   * This method applies a transformation to position the object
   * before calling the drawElements method, then resets the transformation.
   * 
   * @param g2d the Graphics2D object used for drawing
   */
  public void draw(Graphics2D g2d) {
    AffineTransform reset = g2d.getTransform();
    g2d.translate(posX, posY);
    drawElements(g2d);
    g2d.setTransform(reset);
  }

  /**
   * Abstract method that needs to be implemented to draw the object
   * 
   * @param g2d the Graphics2D object used for drawing
   */
  public abstract void drawElements(Graphics2D g2d);

  /**
   * Gets the X-coordinate of the object.
   * 
   * @return the X-coordinate
   */
  public double getX() {
    return posX;
  }

  /**
   * Gets the Y-coordinate of the object.
   * 
   * @return the Y-coordinate
   */
  public double getY() {
    return posY;
  }

  /**
   * Sets the position of the object.
   * 
   * @param x the new X-coordinate
   * @param y the new Y-coordinate
   */
  public void setPosition(double x, double y) {
    posX = x;
    posY = y;
  }

  /**
   * Updates the state of the object.
   * 
   * @param t the time
   */
  public void update(int t) {
  }

}