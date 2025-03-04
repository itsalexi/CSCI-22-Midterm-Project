
/**
 * The Sky class represents a parallax sky that contains different
 * sky objects. It extends the ParallaxObject class.
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
import java.util.ArrayList;

public class Sky extends ParallaxObject {
  private ArrayList<DrawingObject> objects;
  private float alpha;

  /**
   * Constructs a Sky object with the initial
   * Y-coordinate. It also initializes different cloud objects
   * to be drawn on the sky later.
   * 
   * @param y the initial Y-coordinate of the sky
   */
  public Sky(double y) {
    super(0, y, 0);
    objects = new ArrayList<>();

    objects.add(new Cloud(50, 100, 0));
    objects.add(new Cloud(60, 127, 1));
    objects.add(new Cloud(100, 80, 0));
    objects.add(new Cloud(250, 98, 1));
    objects.add(new Cloud(320, 115, 0));
    objects.add(new Cloud(350, 110, 0));
    objects.add(new Cloud(310, 90, 1));
    objects.add(new Cloud(432, 135, 1));
    objects.add(new Cloud(475, 100, 0));
    objects.add(new Cloud(550, 115, 0));
    objects.add(new Cloud(585, 105, 1));
    objects.add(new Cloud(640, 136, 0));
    objects.add(new Cloud(625, 126, 1));
    objects.add(new Cloud(686, 115, 1));
    objects.add(new Cloud(712, 165, 0));
    objects.add(new Cloud(743, 126, 1));

    objects.add(new Cloud(800, 110, 1));

  }
  
  private AlphaComposite makeComposite(float alpha) {
    int type = AlphaComposite.SRC_OVER;
    return(AlphaComposite.getInstance(type, alpha));
  }

  /**
   * Draws the sky
   * 
   * @param g2d the Graphics2D object used for rendering
   */
  @Override
  public void drawElements(Graphics2D g2d) {
    Composite originalComposite = g2d.getComposite();
    g2d.setComposite(makeComposite(alpha));
    for (DrawingObject o : objects) {
      o.draw(g2d);
    }
    g2d.setComposite(originalComposite);
  }

  public void setAlpha(double a){
    alpha = (float) a;
  }
}
