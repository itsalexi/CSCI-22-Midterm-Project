
/**
 * The Sun class represents a sun-like object with specified position, dimensions, and transparency.
 * It consists of a hexagon and multiple triangles drawn around it to simulate a sun's rays.
 * The class extends the DrawingObject class and provides functionality to draw the sun on a graphics context.
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

public class Sun extends DrawingObject {

  private double width, height;
  private float alpha;

  /**
   * Constructs a new Sun object with the specified position, width, and height.
   * The transparency is set to full opacity by default (alpha = 1).
   *
   * @param x the X-coordinate of the sun's center
   * @param y the Y-coordinate of the sun's center
   * @param w the width of the sun
   * @param h the height of the sun
   */
  public Sun(double x, double y, double w, double h) {
    super(x, y);
    width = w;
    height = h;
    alpha = 1;
  }

  /**
   * Creates an AlphaComposite object to control the transparency of the sun.
   * 
   * @param alpha the transparency level (from 0.0f to 1.0f)
   * @return an AlphaComposite object for the specified transparency level
   */
  private AlphaComposite makeComposite(float alpha) {
    int type = AlphaComposite.SRC_OVER;
    return (AlphaComposite.getInstance(type, alpha));
  }

  /**
   * Draws the sun on the provided Graphics2D object.
   * The sun consists of a central hexagon and several triangles representing the
   * rays.
   * The transparency is applied to the sun shape before drawing.
   *
   * @param g2d the Graphics2D object used to draw the sun
   */
  public void drawElements(Graphics2D g2d) {
    AffineTransform reset = g2d.getTransform();
    Composite originaComposite = g2d.getComposite();
    Hexagon hexagon = new Hexagon(0, 0, width, height, new Color(255, 245, 133));
    Triangle triangle = new Triangle(0, -height / 6, width, height, new Color(255, 245, 133));
    g2d.setComposite(makeComposite(alpha));
    hexagon.draw(g2d);
    g2d.rotate(Math.toRadians(30), width / 2, height / 2);
    triangle.draw(g2d);
    for (int i = 0; i < 5; i++) {
      g2d.rotate(Math.toRadians(60), width / 2, height / 2);
      triangle.draw(g2d);
    }
    g2d.setTransform(reset);
    g2d.setComposite(originaComposite);
  }

  /**
   * Sets the transparency (alpha) level of the sun.
   * 
   * @param a the transparency level (from 0.0 to 1.0, where 1.0 is fully opaque)
   */
  public void setAlpha(double a) {
    alpha = (float) a;
  }
}
