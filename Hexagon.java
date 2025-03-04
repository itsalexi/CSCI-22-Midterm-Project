
/**
 * The Hexagon class represents a hexagonal shape that can be drawn 
 * in a 2D space. It extends DrawingObject and provides functionality
 * for defining and rendering a hexagon with a specified color.
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

public class Hexagon extends DrawingObject {
  private Color color;
  private double[] x, y;

  /**
   * Constructs a Hexagon with the specified position, width, height, and color.
   * 
   * @param x the X-coordinate
   * @param y the Y-coordinate
   * @param w the width of the hexagon
   * @param h the height of the hexagon
   * @param c the color of the hexagon
   */
  public Hexagon(double x, double y, double w, double h, Color c) {
    super(x, y);

    this.x = new double[] { x + w / 2, x + w, x + w, x + w / 2, x, x };
    this.y = new double[] { y, y + h / 3, y + h * 2 / 3, y + h, y + h * 2 / 3, y + h / 3 };

    color = c;
  }

  /**
   * Draws the hexagon using a Graphics2D object.
   * This method constructs a Path2D object and fills it with color.
   * 
   * @param g2d the Graphics2D object used for drawing
   */
  @Override
  public void drawElements(Graphics2D g2d) {
    Path2D.Double hexagon = new Path2D.Double();
    hexagon.moveTo(x[0], y[0]);
    for (int i = 1; i < 6; i++) {
      hexagon.lineTo(x[i], y[i]);
    }
    hexagon.closePath();
    g2d.setColor(color);
    g2d.fill(hexagon);
  }

}