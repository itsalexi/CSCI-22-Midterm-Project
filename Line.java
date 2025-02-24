import java.awt.*;
import java.awt.geom.*;

public class Line extends DrawingObject {
  private Color color;
  private double endX;
  private double endY;
  private double width;

  public Line(double x, double y, double x2, double y2, double w, Color c) {
    super(x, y);
    endX = x2;
    endY = y2;
    width = w;
    color = c;
  }

  @Override
  public void draw(Graphics2D g2d) {
    Line2D.Double line = new Line2D.Double(this.getX(), this.getY(), endX, endY);
    g2d.setStroke(new BasicStroke( (float) width));
    g2d.setColor(color);
    g2d.draw(line);
  }

}