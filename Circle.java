import java.awt.*;
import java.awt.geom.*;

public class Circle extends DrawingObject {
  private int size;
  private Color color;

  public Circle(double x, double y, int s, Color c) {
    super(x, y);
    size = s;
    color = c;
  }

  @Override
  public void draw(Graphics2D g2d) {
    Ellipse2D.Double circle = new Ellipse2D.Double(this.getX(), this.getY(), size, size);
    g2d.setColor(color);
    g2d.fill(circle);
  }

}