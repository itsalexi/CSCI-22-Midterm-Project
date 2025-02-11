import java.awt.*;
import java.awt.geom.*;

public class Square extends DrawingObject {
  private int size;

  public Square(double x, double y, int s) {
    super(x, y);
    size = s;
  }

  @Override
  public void draw(Graphics2D g2d) {
    Rectangle2D.Double square = new Rectangle2D.Double(posX, posY, size, size);
    g2d.setColor(Color.BLACK);
    g2d.fill(square);
  }

  public double getSize() {
    return size;
  }

}
