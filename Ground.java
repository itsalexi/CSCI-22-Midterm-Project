import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Ground extends ParallaxObject {
  public Ground(double s, double y) {
    super(0, y, s);
  }

  @Override
  public void drawElements(Graphics2D g2d) {

    g2d.setColor(new Color(75, 87, 97));
    g2d.fill(new Rectangle2D.Double(0, 556.7, 800, 43.3));
    g2d.fill(new Rectangle2D.Double(-4.7, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(39.4, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(86.5, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(130.9, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(175.4, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(219.5, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(264, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(308.4, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(352.9, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(397.3, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(441.8, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(486.2, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(530.4, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(574.9, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(619.3, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(663.8, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(707.8, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(752.2, 510.6, 9.5, 34.6));
    g2d.fill(new Rectangle2D.Double(795.9, 510.6, 9.5, 34.6));


    g2d.setColor(new Color(175, 178, 187));
    g2d.fill(new Rectangle2D.Double(0, 540, 800, 10.4));

  }

}
