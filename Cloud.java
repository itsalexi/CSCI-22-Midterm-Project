
/**
 * The Cloud class represents a cloud object that consists of multiple pixel-based sprite variations.
 * It extends the DrawingObject class and allows for different cloud sprites to be selected.
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

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

public class Cloud extends DrawingObject {
  private int spriteIndex;
  private ArrayList<PixelGrid> sprites;

  /**
   * Constructs a Cloud object at the specified coordinates.
   * 
   * @param x the X-coordinate of the cloud
   * @param y the Y-coordinate of the cloud
   */
  public Cloud(double x, double y, int i) {
    super(x, y);
    spriteIndex = i;
    sprites = new ArrayList<>();

    Color[][] cloud1 = {
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(150, 203, 237),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(150, 203, 237), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(150, 203, 237),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(223, 229, 243), new Color(223, 229, 243), new Color(223, 229, 243),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(150, 203, 237), new Color(150, 203, 237),
            new Color(150, 203, 237), new Color(0, 0, 0, 0) } };
    Color[][] cloud2 = {{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(0, 0, 0, 0)},{new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(0, 0, 0, 0)},{new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(0, 0, 0, 0)},{new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(223, 229, 243),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(150, 203, 237),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)}};
    sprites.add(new PixelGrid(0, 0, cloud1, 5));
    sprites.add(new PixelGrid(0, 0, cloud2, 5));

  }

  /**
   * Draws the current sprite of the cloud on the provided Graphics2D object.
   * 
   * @param g2d the Graphics2D object used for rendering
   */
  @Override
  public void drawElements(Graphics2D g2d) {
    AffineTransform reset = g2d.getTransform();
    g2d.translate(0, -sprites.get(spriteIndex).getHeight());
    sprites.get(spriteIndex).draw(g2d);
    g2d.setTransform(reset);
  }

  /**
   * Returns the width of the current sprite.
   * 
   * @return the width of the sprite
   */
  public double getWidth() {
    return sprites.get(spriteIndex).getWidth();
  }

  /**
   * Returns the height of the current sprite.
   * 
   * @return the height of the sprite
   */
  public double getHeight() {
    return sprites.get(spriteIndex).getHeight();
  }

  /**
   * Sets the sprite index to a new value.
   * 
   * @param i the new sprite index
   */
  public void setSprite(int i) {
    spriteIndex = i;
  }

  /**
   * Returns the current sprite index.
   * 
   * @return the sprite index
   */
  public int getSprite() {
    return spriteIndex;
  }

  /**
   * Returns the PixelGrid sprite at the specified index.
   * 
   * @param i the index of the sprite
   * @return the PixelGrid sprite at the given index
   */
  public PixelGrid getSprite(int i) {
    return sprites.get(i);
  }
}
