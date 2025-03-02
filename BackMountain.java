import java.awt.*;
import java.awt.geom.*;

public class BackMountain extends ParallaxObject {
  public BackMountain(int s, double y) {
    super(0, y, s);
  }

  @Override
  public void drawElements(Graphics2D g2d) {
    Path2D.Double p = new Path2D.Double();
    Rectangle2D.Double base = new Rectangle2D.Double(0, 200.6, 800, 69.4);
    Color color = new Color(209, 44, 58);
    g2d.setColor(color);
    p.moveTo(0, 205.3);
    p.lineTo(0, 85.1);
    p.lineTo(16.6, 114.5);
    p.lineTo(28.9, 92.9);
    p.lineTo(43.3, 121);
    p.lineTo(67.3, 81.7);
    p.lineTo(89.3, 120);
    p.lineTo(133.3, 42.3);
    p.lineTo(171.9, 110.8);
    p.lineTo(201.2, 60);
    p.lineTo(241.2, 132.5);
    p.lineTo(274.9, 74.1);
    p.lineTo(296.9, 111.8);
    p.lineTo(346.7, 23.9);
    p.lineTo(391.9, 102.4);
    p.lineTo(430.9, 33.1);
    p.lineTo(478.4, 115.8);
    p.lineTo(531.4, 23.8);
    p.lineTo(573.4, 97.8);
    p.lineTo(589.1, 71.4);
    p.lineTo(621.3, 129.4);
    p.lineTo(654.9, 64.9);
    p.lineTo(674.9, 103.9);
    p.lineTo(720.9, 23.9);
    p.lineTo(776.9, 122.9);
    p.lineTo(800, 81.9);
    p.lineTo(800, 205.3);

    g2d.fill(p);
    g2d.fill(base);
  }

}
