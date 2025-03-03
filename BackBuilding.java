import java.awt.*;
import java.awt.geom.Rectangle2D;

public class BackBuilding extends ParallaxObject {
  private Boolean isNight;

  public BackBuilding(double s, double y) {
    super(0, y, s);
    isNight = true;
  }

  public void toggleNight() {
    isNight = !isNight;
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

    if (isNight) {
      g2d.setColor(new Color(246, 255, 117, 100));
      g2d.fill(new Rectangle2D.Double(14.1, 244.8, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(17.5, 295.5, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(39, 295.5, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(80.7, 278.4, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(97.8, 313.3, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(83.2, 364.6, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(147.1, 295.5, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(169.9, 295.5, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(171, 331.2, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(147, 379, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(217.6, 318.4, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(243.9, 318.4, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(239.1, 349.2, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(218.2, 386.8, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(285.8, 252.1, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(306.2, 287, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(285.4, 327.3, 19, 23.1));

      g2d.fill(new Rectangle2D.Double(367.2, 298.5, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(348.1, 338.8, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(367.2, 384, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(414.5, 298.5, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(440.5, 340.1, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(411.5, 380.7, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(493.4, 339, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(532.3, 298.5, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(532.2, 380, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(586, 273.8, 19, 23.1));

      g2d.fill(new Rectangle2D.Double(617, 313.1, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(588.7, 359.4, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(667.9, 279.7, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(701, 279.7, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(675.6, 326.2, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(702.6, 359.4, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(754.8, 317.2, 19, 23.1));
      g2d.fill(new Rectangle2D.Double(779, 296.4, 19, 23.1));

      g2d.setColor(new Color(246, 255, 117, 255));
      g2d.fill(new Rectangle2D.Double(16.9, 247.3, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(20, 297.8, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(41.8, 297.8, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(83.5, 281, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(101, 315.8, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(86, 367.1, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(149.9, 297.8, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(172.9, 297.8, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(173.9, 333.7, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(149.9, 381.5, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(220.4, 320.9, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(246.7, 319.7, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(241.5, 351.7, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(220.4, 389.9, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(288.3, 254.2, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(308.6, 289.9, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(288.6, 329.9, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(369.7, 301.3, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(350.7, 341.7, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(369.7, 386.5, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(417.3, 301.3, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(443.3, 342.7, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(414.3, 383.5, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(535, 301.3, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(496.2, 341.5, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(535.1, 382.5, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(588.8, 276.5, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(620.5, 315.7, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(591.5, 361.9, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(670.8, 282, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(703.8, 282, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(678.5, 328.7, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(705.8, 361.9, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(757.2, 319.3, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(781.8, 298.9, 13.4, 18));

    }
  }

}
