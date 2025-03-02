import java.awt.*;
import java.awt.geom.*;

public class Hexagon extends DrawingObject {
  private Color color;
  private double[] x, y;

  public Hexagon(double x, double y, double w, double h, Color c) {
    super(x, y);

    this.x = new double[] {x + w / 2, x + w, x + w, x + w / 2, x, x};
    this.y = new double[] {y, y + h / 3, y + h * 2 / 3, y + h, y + h * 2 / 3, y + h / 3};

    color = c;
  }

  @Override
  public void drawElements(Graphics2D g2d) {
    Path2D.Double hexagon = new Path2D.Double();
    hexagon.moveTo(x[0], y[0]);
    for(int i = 1; i < 6; i++){
        hexagon.lineTo(x[i], y[i]);
    }
    hexagon.closePath();
    g2d.setColor(color);
    g2d.fill(hexagon);
  }

}