import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class Mountain extends ParallaxObject {
  public Mountain(int s, double y, GameConfig c) {
    super(s, y, c);
  }

  @Override
  public void drawElements(Graphics2D g2d, double x, double y) {

    Path2D.Double p = new Path2D.Double();
    Rectangle2D.Double base = new Rectangle2D.Double(0, 248.6 + y, 800, 69.4);
    Color color = new Color(160, 2, 51);
    g2d.setColor(color);

    p.moveTo(x, 318 + y);
    p.lineTo(x, 151.8 + y);
    p.lineTo(24.2 + x, 203.8 + y);
    p.lineTo(48.8 + x, 161.8 + y);
    p.lineTo(75.6 + x, 205.8 + y);
    p.lineTo(138.8 + x, 93.7 + y);
    p.lineTo(184.9 + x, 174.3 + y);
    p.lineTo(230.2 + x, 93.7 + y);
    p.lineTo(282.9 + x, 186.5 + y);
    p.lineTo(319.4 + x, 121.5 + y);
    p.lineTo(363.4 + x, 197.5 + y);
    p.lineTo(417.4 + x, 103.5 + y);
    p.lineTo(467.4 + x, 190.5 + y);
    p.lineTo(533.4 + x, 64.5 + y);
    p.lineTo(583.4 + x, 164.5 + y);
    p.lineTo(612.4 + x, 103.5 + y);
    p.lineTo(655.1 + x, 185.5 + y);
    p.lineTo(712.3 + x, 77.5 + y);
    p.lineTo(753.3 + x, 210.8 + y);
    p.lineTo(800 + x, 151.1 + y);
    p.lineTo(800 + x, 251.8 + y);

    g2d.fill(p);
    g2d.fill(base);
  }

}
