
/**
 * The Line class represents a line object that draws a line
 * given specified start and end points, color, and thickness, 
 * extending the DrawingObject class.
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

public class Line extends DrawingObject {
  private Color color;
  private double endX;
  private double endY;
  private double width;

  /**
   * Constructs a Line object with the given start and end points,
   * width, and color.
   * 
   * @param x  the X-coordinate of the starting point
   * @param y  the Y-coordinate of the starting point
   * @param x2 the X-coordinate of the ending point
   * @param y2 the Y-coordinate of the ending point
   * @param w  the width of the line
   * @param c  the color of the line
   */
  public Line(double x, double y, double x2, double y2, double w, Color c) {
    super(x, y);
    endX = x2 - x;
    endY = y2 - y;
    width = w;
    color = c;
  }

  /**
   * Draws the line on the provided Graphics2D object.
   * 
   * @param g2d the Graphics2D object on which the line will be drawn
   */
  @Override
  public void drawElements(Graphics2D g2d) {
    Line2D.Double line = new Line2D.Double(0, 0, endX, endY);
    g2d.setStroke(new BasicStroke((float) width));
    g2d.setColor(color);
    g2d.draw(line);
  }

}