
/**
 * The PixelGrid class represents a grid of colored pixels that can be drawn on a Graphics2D object.
 * Each pixel in the grid is represented as a small square with a specified color and size.
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

public class PixelGrid extends DrawingObject {

    private Color[][] grid;
    private double pixelSize;

    /**
     * Constructs a PixelGrid object with the specified position, grid of colors,
     * and pixel size.
     * 
     * @param x the X-coordinate of the grid's position
     * @param y the Y-coordinate of the grid's position
     * @param g the 2D array of colors representing the grid
     * @param p the size of each individual pixel
     */
    public PixelGrid(double x, double y, Color[][] g, double p) {
        super(x, y);
        grid = g;
        pixelSize = p;
    }

    /**
     * Draws the individual pixels of the grid on the provided Graphics2D
     * object.
     * 
     * @param g2d the Graphics2D object used for drawing the pixels
     */
    public void drawElements(Graphics2D g2d) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                new Square(j * pixelSize, i * pixelSize, pixelSize, grid[i][j]).draw(g2d);
            }
        }
    }

    /**
     * Returns the width of the grid
     * 
     * @return the width of the grid
     */
    public double getWidth() {
        return grid[0].length * pixelSize;
    }

    /**
     * Returns the height of the grid
     * 
     * @return the height of the grid
     */
    public double getHeight() {
        return grid.length * pixelSize;
    }
}
