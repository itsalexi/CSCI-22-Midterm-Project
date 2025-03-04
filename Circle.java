
/**
 * The Circle class represents a drawable circular object that extends DrawingObject.
 * It includes properties for size and color.
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

public class Circle extends DrawingObject {
  private int size;
  private Color color;

  /**
   * Constructs a Circle object with the specified position, size, and color.
   * 
   * @param x the X-coordinate of the circle's position
   * @param y the Y-coordinate of the circle's position
   * @param s the size of the circle
   * @param c the color of the circle
   */
  public Circle(double x, double y, int s, Color c) {
    super(x, y);
    size = s;
    color = c;
  }

  /**
   * Draws the circle on the provided Graphics2D object.
   * 
   * @param g2d the Graphics2D object used for rendering
   */
  @Override
  public void drawElements(Graphics2D g2d) {
    Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, size, size);
    g2d.setColor(color);
    g2d.fill(circle);
  }

}