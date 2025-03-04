
/**
 * The FrontBuilding class represents a background building object in a parallax environment.
 * It extends the ParallaxObject class.
 * 
 * @author Alexi Roth Luis A. Canamo (245333)
 * @author Kenaz R. Celestino (241051)
 * @version March 5, 2025
 * 
 * I have not discussed the Java language code in my program 
 * with anyone other than my instructor or the teaching assistants 
 * assigned to this course.
 * 
 * I have not used Java language code obtained from another student, 
 * or any other unauthorized source, either modified or unmodified.
 * 
 * If any Java language code or documentation used in my program 
 * was obtained from another source, such as a textbook or website, 
 * that has been clearly noted with a proper citation in the comments 
 * of my program.
 */
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class FrontBuilding extends ParallaxObject {

  /**
   * Constructs a FrontBuilding object with the specified speed and initial
   * Y-coordinate.
   * 
   * @param s the speed of the background building in the parallax effect
   * @param y the initial Y-coordinate of the background building
   */
  public FrontBuilding(double s, double y) {
    super(0, y, s);
  }

  /**
   * Draws the background building elements on the provided Graphics2D object.
   * 
   * @param g2d the Graphics2D object used for rendering
   */
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

    g2d.setColor(new Color(164, 177, 224));
    g2d.fill(new Rectangle2D.Double(0, 482.8, 800, 60));

    g2d.setColor(new Color(120, 152, 200));
    g2d.fill(new Rectangle2D.Double(0, 490.5, 53.3, 49.5));
    g2d.fill(new Rectangle2D.Double(52.3, 490.5, 24.8, 9.1));
    g2d.fill(new Rectangle2D.Double(76.5, 490.5, 75.9, 49.5));
    g2d.fill(new Rectangle2D.Double(150.1, 490.5, 37.1, 32.2));
    g2d.fill(new Rectangle2D.Double(186.2, 490.5, 26.6, 49.5));
    g2d.fill(new Rectangle2D.Double(212.2, 490.5, 37.1, 32.2));
    g2d.fill(new Rectangle2D.Double(246.8, 490.5, 75, 49.5));
    g2d.fill(new Rectangle2D.Double(319.6, 490.5, 71.4, 32.2));
    g2d.fill(new Rectangle2D.Double(390.3, 490.5, 30.9, 45.5));
    g2d.fill(new Rectangle2D.Double(420.3, 490.5, 68.5, 49.2));
    g2d.fill(new Rectangle2D.Double(487.2, 490.5, 29.7, 32.4));
    g2d.fill(new Rectangle2D.Double(515.5, 490.5, 24.3, 43.2));
    g2d.fill(new Rectangle2D.Double(537.9, 490.5, 81.4, 32.4));
    g2d.fill(new Rectangle2D.Double(618.3, 490.5, 63.6, 49.2));
    g2d.fill(new Rectangle2D.Double(680.3, 490.5, 33.4, 8.1));
    g2d.fill(new Rectangle2D.Double(712.5, 490.5, 89.4, 49.5));

    if (this.getTime() > 0.5) {
      g2d.setColor(new Color(246, 255, 117, 100));
      g2d.fill(new Rectangle2D.Double(3.8, 409.8, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(29.9, 434.4, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(85, 398.9, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(121.4, 399.1, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(196.2, 380.7, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(256.1, 348.1, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(292.4, 347.8, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(292.4, 392.3, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(431, 397, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(466, 431.8, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(630, 398.6, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(653.3, 434.4, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(716.5, 427.9, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(747, 363.5, 13.4, 18));
      g2d.fill(new Rectangle2D.Double(778, 405.9, 13.4, 18));

      g2d.setColor(new Color(246, 255, 117, 255));
      g2d.fill(new Rectangle2D.Double(6.6, 412.4, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(32.7, 437, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(87.7, 401.6, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(124.2, 401.6, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(199, 383.3, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(258.9, 350.7, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(295.3, 350.7, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(295.3, 394.4, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(433.1, 399.5, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(469.7, 434.1, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(633.5, 401.1, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(656.2, 437, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(719.7, 429.8, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(749.8, 365.3, 13.4, 14.8));
      g2d.fill(new Rectangle2D.Double(781, 408.5, 13.4, 14.8));

    }
  }

}
