import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Mountain extends ParallaxObject {
  public Mountain(double s, double y) {
    super(0, y, s);
  }

  @Override
  public void drawElements(Graphics2D g2d) {

    Color color = new Color(66, 96, 130);
    g2d.setColor(color);

    g2d.fill(new Rectangle2D.Double(0, 402.3, 54, 84.7));
    g2d.fill(new Rectangle2D.Double(6.6, 351.1, 17.7, 51.2));
    g2d.fill(new Rectangle2D.Double(53.4, 458.6, 23.7, 28.5));
    g2d.fill(new Rectangle2D.Double(76.5, 376.7, 10, 110.4));
    g2d.fill(new Rectangle2D.Double(85.7, 386.5, 7, 100.6));
    g2d.fill(new Rectangle2D.Double(91.9, 376.7, 45, 110.4));
    g2d.fill(new Rectangle2D.Double(136.1, 386.5, 6.2, 100.6));
    g2d.fill(new Rectangle2D.Double(142.1, 376.7, 8, 110.4));
    g2d.fill(new Rectangle2D.Double(149.9, 431.9, 37.4, 55.2));
    g2d.fill(new Rectangle2D.Double(186.2, 368.6, 39, 118.4));
    g2d.fill(new Rectangle2D.Double(224.2, 431.9, 23.9, 55.2));
    g2d.fill(new Rectangle2D.Double(247.2, 337.7, 72.4, 149.4));
    g2d.fill(new Rectangle2D.Double(258.9, 328.7, 24.5, 10.1));
    g2d.fill(new Rectangle2D.Double(258.9, 328.7, 24.5, 10.1));
    g2d.fill(new Rectangle2D.Double(318.6, 431.9, 72.4, 55.2));
    g2d.fill(new Rectangle2D.Double(390, 420.3, 31.2, 66.7));
    g2d.fill(new Rectangle2D.Double(394.8, 412.4, 26.4, 5));
    g2d.fill(new Rectangle2D.Double(397.5, 416.4, 5, 6.5));
    g2d.fill(new Rectangle2D.Double(405.6, 416.4, 5, 6.5));
    g2d.fill(new Rectangle2D.Double(413.6, 416.4, 5, 6.5));
    g2d.fill(new Rectangle2D.Double(417.3, 387.5, 79.5, 8));
    g2d.fill(new Rectangle2D.Double(420.2, 394.5, 73.2, 92.6));
    g2d.fill(new Rectangle2D.Double(491.2, 431.9, 25.8, 55.2));
    g2d.fill(new Rectangle2D.Double(516.3, 422.8, 28.1, 64.2));
    g2d.fill(new Rectangle2D.Double(543.5, 432.9, 22.7, 54.2));
    g2d.fill(new Rectangle2D.Double(559.5, 422.8, 25.9, 64.2));
    g2d.fill(new Rectangle2D.Double(581.1, 432.9, 42.1, 54.2));
    g2d.fill(new Rectangle2D.Double(622.4, 390.5, 56.1, 96.6));
    g2d.fill(new Rectangle2D.Double(677.5, 458.6, 36.2, 28.5));
    g2d.fill(new Rectangle2D.Double(710.5, 413.9, 29.5, 73.2));
    g2d.fill(new Rectangle2D.Double(712.1, 404.3, 27.9, 5));
    g2d.fill(new Rectangle2D.Double(714.7, 407.4, 5, 6.5));
    g2d.fill(new Rectangle2D.Double(722.8, 407.4, 5, 6.5));
    g2d.fill(new Rectangle2D.Double(730.8, 407.4, 5, 6.5));
    g2d.fill(new Rectangle2D.Double(737.8, 351.1, 58.1, 136));
    g2d.fill(new Rectangle2D.Double(795, 402.3, 5.1, 84.7));

  }

}
