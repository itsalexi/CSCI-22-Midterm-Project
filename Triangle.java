import java.awt.*;
import java.awt.geom.*;

public class Triangle extends DrawingObject {
  private Color color;
  private int[] x;
  private int[] y;

  public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, Color c) {
    super(x1, y2);

    x = new int[] {x1, x2, x3};
    y = new int[] {y1, y2, y3};

    color = c;
  }

  @Override
  public void draw(Graphics2D g2d) {
    Polygon triangle = new Polygon(x, y, 3);
    g2d.draw(triangle);
  }

}