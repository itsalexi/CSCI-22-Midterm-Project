import java.awt.*;
import java.awt.geom.*;

public class Square extends DrawingObject {
  private int size;
  private Color color;

  public Square(double x, double y, int s, Color c) {
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