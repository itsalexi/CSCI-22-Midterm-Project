
/**
 * The Stars class represents a collection of stars in a parallax background effect.
 * The stars are drawn at specific positions with adjustable transparency.
 * The class extends the ParallaxObject class, which allows for parallax movement behavior.
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

public class Stars extends ParallaxObject {

    private double alpha;

    private int[][] starPositions = {
            { 50, 50 }, { 100, 80 }, { 200, 30 }, { 300, 60 },
            { 400, 90 }, { 500, 40 }, { 600, 70 }, { 700, 20 }
    };

    /**
     * Constructs a Stars object with the specified Y-position for the parallax
     * effect.
     *
     * @param y the Y-coordinate for the position of the stars
     */
    public Stars(double y) {
        super(0, y, 0);
        alpha = 0;
    }

    /**
     * Draws the stars on the provided Graphics2D object.
     * The stars are drawn as small filled ovals at predefined positions.
     * The transparency is applied based on the alpha value.
     *
     * @param g2d the Graphics2D object used to draw the stars
     */
    public void drawElements(Graphics2D g2d) {
        g2d.setColor(new Color(255, 255, 255, (int) (255 * alpha)));
        for (int[] pos : starPositions) {
            int starX = pos[0];
            int starY = pos[1];
            g2d.fillOval(starX, starY, 3, 3);
        }
    }

    /**
     * Sets the transparency level of the stars.
     * 
     * @param a the transparency level
     */
    public void setAlpha(double a) {
        alpha = a;
    }
}
