import java.awt.*;
import java.awt.geom.*;

public class Triangle extends DrawingObject {
  private Color color;
  private double[] x, y;

  public Triangle(double x, double y, double w, double h, Color c) {
    super(x, y);

    this.x = new double[] {x + w / 2, x + w, x + w, x + w / 2, x, x};
    this.y = new double[] {y, y + h / 3, y + h * 2 / 3, y + h, y + h * 2 / 3, y + h / 3};

    color = c;
  }

  @Override
  public void drawElements(Graphics2D g2d) {
    Path2D.Double triangle = new Path2D.Double();
    triangle.moveTo(x[0], y[0]);
    for(int i = 1; i < 6; i++){
        triangle.lineTo(x[i], y[i]);
    }
    triangle.closePath();
    g2d.setColor(color);
    g2d.fill(triangle);
  }

}