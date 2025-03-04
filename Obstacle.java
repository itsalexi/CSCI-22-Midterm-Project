
/**
 * The Obstacle class represents an obstacle in a parallax scrolling game, 
 * which is drawn with a sprite and can move across the screen. 
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
 **/
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Obstacle extends ParallaxObject {

    private int spriteIndex;
    private static ArrayList<PixelGrid> sprites = new ArrayList<>();

    /**
     * Constructs an Obstacle object with specified Y-position, scale,
     * and sprite index.
     * 
     * @param y the Y-coordinate of the obstacle
     * @param s the scale of the obstacle
     * @param i the index of the sprite to be used for the obstacle
     */
    public Obstacle(double y, double s, int i) {
        super((double) 800, y, s);
        spriteIndex = i;
        this.setPosition(800, this.getY() - sprites.get(spriteIndex).getHeight());
    }

    /**
     * Sets up the sprite images for obstacles, adding them to the sprite list.
     */
    public static void setUpSprites() {
        Color[][] hydrant = {
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(255, 35, 2), new Color(255, 35, 2), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(255, 35, 2),
                        new Color(255, 35, 2), new Color(255, 35, 2), new Color(255, 79, 34), new Color(255, 79, 34),
                        new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(255, 79, 34), new Color(255, 79, 34),
                        new Color(255, 79, 34), new Color(255, 79, 34), new Color(255, 79, 34), new Color(255, 79, 34),
                        new Color(255, 79, 34), new Color(255, 79, 34), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(255, 35, 2), new Color(255, 35, 2), new Color(255, 35, 2),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(171, 28, 1), new Color(161, 27, 3),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(171, 27, 3), new Color(171, 27, 3),
                        new Color(171, 27, 3), new Color(171, 27, 3), new Color(171, 27, 3), new Color(135, 20, 2),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(253, 35, 2), new Color(171, 28, 1), new Color(161, 27, 3),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(253, 81, 34), new Color(253, 81, 34),
                        new Color(171, 27, 3), new Color(171, 27, 3), new Color(171, 27, 3), new Color(135, 20, 2),
                        new Color(135, 20, 2), new Color(0, 0, 0, 0) },
                { new Color(255, 255, 255), new Color(253, 35, 2), new Color(171, 28, 1), new Color(161, 27, 3),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(255, 255, 255),
                        new Color(255, 255, 255), new Color(135, 20, 2), new Color(135, 20, 2), new Color(135, 20, 2),
                        new Color(135, 20, 2), new Color(135, 20, 2), new Color(255, 255, 255) },
                { new Color(255, 255, 255), new Color(171, 28, 1), new Color(171, 28, 1), new Color(161, 27, 3),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(199, 199, 199),
                        new Color(199, 199, 199), new Color(108, 14, 0), new Color(108, 14, 0), new Color(108, 14, 0),
                        new Color(108, 14, 0), new Color(135, 20, 2), new Color(255, 255, 255) },
                { new Color(0, 0, 0, 0), new Color(171, 28, 1), new Color(171, 28, 1), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(108, 14, 0), new Color(108, 14, 0),
                        new Color(108, 14, 0), new Color(108, 14, 0), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(135, 20, 2), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(171, 28, 1), new Color(171, 28, 1), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(136, 19, 2), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(253, 81, 34),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(253, 81, 34),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(253, 81, 34), new Color(253, 81, 34), new Color(253, 81, 34),
                        new Color(171, 28, 1), new Color(171, 28, 1), new Color(171, 28, 1), new Color(171, 28, 1),
                        new Color(171, 28, 1), new Color(136, 19, 2), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(136, 19, 2), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(136, 19, 2), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(136, 19, 2), new Color(136, 19, 2), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(136, 19, 2), new Color(136, 19, 2), new Color(108, 14, 0), new Color(108, 14, 0),
                        new Color(108, 14, 0), new Color(0, 0, 0, 0) } };
        sprites.add(new PixelGrid(0, 0, hydrant, 4));
    }

    /**
     * Draws the sprite of the obstacle on the provided Graphics2D object.
     * 
     * @param g2d the Graphics2D object used for rendering
     */
    @Override
    public void drawElements(Graphics2D g2d) {
        sprites.get(spriteIndex).draw(g2d);
    }

    /**
     * Draws the obstacle on the provided Graphics2D object, including
     * translating it based on its position and resetting the transform.
     * 
     * @param g2d the Graphics2D object used for drawing
     */
    @Override
    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();
        g2d.translate(this.getX(), this.getY());
        drawElements(g2d);
        g2d.setTransform(reset);
        if (this.getX() <= -800) {
            this.setPosition(0, this.getY());
        }
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
    public PixelGrid getSprite() {
        return sprites.get(spriteIndex);
    }

    /**
     * Returns the hitbox of the obstacle
     * 
     * @return the hitbox of the obstacle
     */
    public Rectangle2D getHitBox() {
        return new Rectangle2D.Double(this.getX(), this.getY(),
                sprites.get(spriteIndex).getWidth(),
                sprites.get(spriteIndex).getHeight());
    }

    /**
     * Returns the number of sprites available for the obstacle.
     * 
     * @return the number of sprites
     */
    public static int getNumSprites() {
        return sprites.size();
    }
}
