import java.awt.*;
import java.awt.geom.Rectangle2D;

public class BackBuilding extends ParallaxObject {
  public BackBuilding(double s, double y) {
    super(0, y, s);
  }

  @Override
  public void drawElements(Graphics2D g2d) {

    Color color = new Color(78, 117, 162);
    g2d.setColor(color);

    g2d.fill(new Rectangle2D.Double(10, 238, 53.2, 255.6));
    g2d.fill(new Rectangle2D.Double(17.7, 232.6, 43.3, 6.8));
    g2d.fill(new Rectangle2D.Double(17.7, 232.6, 43.3, 6.8));
    g2d.fill(new Rectangle2D.Double(17.7, 225.9, 25.1, 6.8));

    g2d.fill(new Rectangle2D.Double(76.2, 269.4, 43.3, 221.4));
    g2d.fill(new Rectangle2D.Double(85, 259.1, 26.2, 12.4));

    g2d.fill(new Rectangle2D.Double(139.9, 285.4, 55.5, 205.4));
    g2d.fill(new Rectangle2D.Double(153.7, 275.1, 28.4, 14.5));

    g2d.fill(new Rectangle2D.Double(209.9, 312.4, 58.5, 178.4));
    g2d.fill(new Rectangle2D.Double(218.9, 303.1, 49.5, 11.7));
    g2d.fill(new Rectangle2D.Double(234.8, 294.2, 33.6, 11.7));
    g2d.fill(new Rectangle2D.Double(243.6, 269.3, 6.1, 27.8));

    g2d.fill(new Rectangle2D.Double(278.7, 239.4, 52, 278.5));
    g2d.fill(new Rectangle2D.Double(288.3, 229.3, 33.6, 11.7));

    g2d.fill(new Rectangle2D.Double(345.3, 287, 52, 212.6));
    g2d.fill(new Rectangle2D.Double(408.8, 285.4, 56.5, 214.3));
    g2d.fill(new Rectangle2D.Double(420.3, 275.1, 33.6, 11.7));
    g2d.fill(new Rectangle2D.Double(434.4, 223.4, 5, 56.3));

    g2d.fill(new Rectangle2D.Double(485, 299.6, 72.5, 196.5));
    g2d.fill(new Rectangle2D.Double(493.3, 289.6, 64.1, 11.7));
    g2d.fill(new Rectangle2D.Double(510.7, 279.7, 46.8, 11.7));
    g2d.fill(new Rectangle2D.Double(522.5, 273.7, 11.6, 8.7));
    g2d.fill(new Rectangle2D.Double(539.9, 273.7, 11.6, 8.7));

    g2d.fill(new Rectangle2D.Double(577.1, 259.1, 65.7, 231.4));
    g2d.fill(new Rectangle2D.Double(587.2, 251.6, 55.5, 11.7));

    g2d.fill(new Rectangle2D.Double(660.4, 269.4, 67.4, 231.4));
    g2d.fill(new Rectangle2D.Double(673.2, 259.8, 40.5, 11.7));

    g2d.fill(new Rectangle2D.Double(749, 285.5, 46.9, 231.4));

  }

}
