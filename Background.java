import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Background extends ParallaxObject {

  public Background(int s, double y) {
    super(s, y);
  }

  @Override
  public void drawElements(Graphics2D g2d, double x, double y) {
    GradientPaint gradient = new GradientPaint(0, 0, new Color(52, 3, 68), 0, 428, new Color(254, 167, 98));
    g2d.setPaint(gradient);
    Rectangle2D.Double base = new Rectangle2D.Double(0, 0, 800, 428);
    g2d.fill(base);
  }
}
