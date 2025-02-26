import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class BackMountain extends ParallaxObject {
  public BackMountain(int s, double y, GameConfig c) {
    super(s, y, c);
  }

  @Override
  public void drawElements(Graphics2D g2d, double x, double y) {
    Path2D.Double p = new Path2D.Double();
    Rectangle2D.Double base = new Rectangle2D.Double(0, 200.6 + y, 800, 69.4);
    Color color = new Color(209, 44, 58);
    g2d.setColor(color);
    p.moveTo(x, 205.3 + y);
    p.lineTo(x, 85.1 + y);
    p.lineTo(x + 16.6, 114.5 + y);
    p.lineTo(x + 28.9, 92.9 + y);
    p.lineTo(x + 43.3, 121 + y);
    p.lineTo(x + 67.3, 81.7 + y);
    p.lineTo(x + 89.3, 120 + y);
    p.lineTo(x + 133.3, 42.3 + y);
    p.lineTo(x + 171.9, 110.8 + y);
    p.lineTo(x + 201.2, 60 + y);
    p.lineTo(x + 241.2, 132.5 + y);
    p.lineTo(x + 274.9, 74.1 + y);
    p.lineTo(x + 296.9, 111.8 + y);
    p.lineTo(x + 346.7, 23.9 + y);
    p.lineTo(x + 391.9, 102.4 + y);
    p.lineTo(x + 430.9, 33.1 + y);
    p.lineTo(x + 478.4, 115.8 + y);
    p.lineTo(x + 531.4, 23.8 + y);
    p.lineTo(x + 573.4, 97.8 + y);
    p.lineTo(x + 589.1, 71.4 + y);
    p.lineTo(x + 621.3, 129.4 + y);
    p.lineTo(x + 654.9, 64.9 + y);
    p.lineTo(x + 674.9, 103.9 + y);
    p.lineTo(x + 720.9, 23.9 + y);
    p.lineTo(x + 776.9, 122.9 + y);
    p.lineTo(x + 800, 81.9 + y);
    p.lineTo(x + 800, 205.3 + y);

    g2d.fill(p);
    g2d.fill(base);
  }

}
