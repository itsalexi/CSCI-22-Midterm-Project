
/**
 * The Triangle class represents a triangle object with specified position, dimensions, and color.
 * It extends the DrawingObject class and provides functionality to draw the triangle on a graphics context.
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

public class Triangle extends DrawingObject {
  private Color color;
  private double[] x, y;

  /**
   * Constructs a new Triangle object with the specified position, size, and
   * color.
   * 
   * @param x the X-coordinate of the top of the triangle
   * @param y the Y-coordinate of the top of the triangle
   * @param w the width of the triangle
   * @param h the height of the triangle
   * @param c the color of the triangle
   */
  public Triangle(double x, double y, double w, double h, Color c) {
    super(x, y);

    this.x = new double[] { x + w / 2, x + w, x + w, x + w / 2, x, x };
    this.y = new double[] { y, y + h / 3, y + h * 2 / 3, y + h, y + h * 2 / 3, y + h / 3 };

    color = c;
  }

  /**
   * Draws the triangle on the given Graphics2D object.
   * 
   * @param g2d the Graphics2D object used to draw the triangle
   */
  @Override
  public void drawElements(Graphics2D g2d) {
    Path2D.Double triangle = new Path2D.Double();
    triangle.moveTo(x[0], y[0]);
    for (int i = 1; i < 6; i++) {
      triangle.lineTo(x[i], y[i]);
    }
    triangle.closePath();
    g2d.setColor(color);
    g2d.fill(triangle);
  }

}