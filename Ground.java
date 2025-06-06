
/**
 * The Ground class represents the ground in a parallax environment.
 * It extends the ParallaxObject class.
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
import java.awt.geom.Rectangle2D;

public class Ground extends ParallaxObject {
  /**
   * Constructs a Ground object with the specified speed and initial
   * Y-coordinate.
   * 
   * @param s the speed of the ground in the parallax effect
   * @param y the initial Y-coordinate of the ground
   */
  public Ground(double s, double y) {
    super(0, y, s);
  }

  /**
   * Draws the ground elements on the provided Graphics2D object.
   * 
   * @param g2d the Graphics2D object used for rendering
   */
  @Override
  public void drawElements(Graphics2D g2d) {
    g2d.setColor(new Color(175, 178, 187));
    g2d.fill(new Rectangle2D.Double(0, 540, 800, 10.4));
    g2d.fill(new Rectangle2D.Double(0, 504.6, 800, 7.7));

    g2d.setColor(new Color(75, 87, 97));
    g2d.fill(new Rectangle2D.Double(0, 556.7, 800, 43.3));
    g2d.fill(new Rectangle2D.Double(-4.7, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(39.4, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(86.5, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(130.9, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(175.4, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(219.5, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(264, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(308.4, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(352.9, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(397.3, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(441.8, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(486.2, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(530.4, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(574.9, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(619.3, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(663.8, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(707.8, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(752.2, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(795.9, 510.6, 9.5, 34.6));

    g2d.setColor(new Color(52, 69, 83));
    g2d.fill(new Rectangle2D.Double(0, 550.4, 800, 8.3));

  }

}
