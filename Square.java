
/**
 * The Square class represents a square object with a specified position, size, and color.
 * It also extends the DrawingObject class.
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

public class Square extends DrawingObject {
  private double size;
  private Color color;

  /**
   * Constructs a new Square object with the specified position, size, and color
   *
   * @param x the X-coordinate of the square
   * @param y the Y-coordinate of the square
   * @param s the size of the square
   * @param c the color of the square
   */
  public Square(double x, double y, double s, Color c) {
    super(x, y);
    size = s;
    color = c;
  }

  @Override
  public void drawElements(Graphics2D g2d) {
    Rectangle2D.Double square = new Rectangle2D.Double(0, 0, size, size);
    g2d.setColor(color);
    g2d.fill(square);
  }

}