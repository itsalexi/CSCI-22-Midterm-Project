import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Mountain extends DrawingObject {
  public Mountain(double s, double y) {
    super(0, y, s);
  }

  @Override
  public void draw(Graphics2D g2d) {

    Path2D.Double p = new Path2D.Double();
    Rectangle2D.Double base = new Rectangle2D.Double(0, 248.6, 800, 69.4);
    Color color = new Color(160, 2, 51);
    g2d.setColor(color);

    p.moveTo(0, 318);
    p.lineTo(0, 151.8);
    p.lineTo(24.2, 203.8);
    p.lineTo(48.8, 161.8);
    p.lineTo(75.6, 205.8);
    p.lineTo(138.8, 93.7);
    p.lineTo(184.9, 174.3);
    p.lineTo(230.2, 93.7);
    p.lineTo(282.9, 186.5);
    p.lineTo(319.4, 121.5);
    p.lineTo(363.4, 197.5);
    p.lineTo(417.4, 103.5);
    p.lineTo(467.4, 190.5);
    p.lineTo(533.4, 64.5);
    p.lineTo(583.4, 164.5);
    p.lineTo(612.4, 103.5);
    p.lineTo(655.1, 185.5);
    p.lineTo(712.3, 77.5);
    p.lineTo(753.3, 210.8);
    p.lineTo(800, 151.1);
    p.lineTo(800, 251.8);

    g2d.fill(p);
    g2d.fill(base);
  }

}
