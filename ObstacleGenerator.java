
/**
 * The ObstacleGenerator class is responsible for generating and managing obstacles in the game.
 * It keeps track of the current obstacles, updates their positions based on speed, and 
 * handles the drawing and acceleration of obstacles over time.
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
import java.util.*;

public class ObstacleGenerator extends DrawingObject {
    private ArrayList<Obstacle> currentObstacles;
    private double objectPosY;
    private double speed;

    /**
     * Constructs an ObstacleGenerator object with specified Y-position and speed.
     * 
     * @param y the Y-coordinate of the obstacle generator
     * @param s the speed at which the obstacles will move
     */
    public ObstacleGenerator(double y, double s) {
        super(0, 0);
        speed = s;
        objectPosY = y;
        currentObstacles = new ArrayList<>();
    }

    /**
     * Draws the current obstacles on the provided Graphics2D object.
     * 
     * @param g2d the Graphics2D object used for drawing
     */
    public void drawElements(Graphics2D g2d) {
        for (Obstacle o : currentObstacles) {
            o.draw(g2d);
        }
    }

    /**
     * Generates a new obstacle and adds it to the current obstacles list.
     * The new obstacle is placed at the specified Y-position and given a random
     * sprite.
     */
    public void generate() {
        currentObstacles.add(new Obstacle(objectPosY, speed, (int) (Math.random() * Obstacle.getNumSprites())));
    }

    /**
     * Updates the position of each obstacle based on their speed and the time
     * interval.
     * The obstacles move leftward, and obstacles that move off-screen are removed.
     * 
     * @param t the time interval
     */
    public void update(int t) {
        for (Obstacle o : currentObstacles) {
            o.setPosition(o.getX() - speed * t / 1000, objectPosY - o.getSprite().getHeight());
        }

        ArrayList<Obstacle> temp = new ArrayList<>();
        for (Obstacle o : currentObstacles) {
            if (o.getX() + o.getSprite().getWidth() > 0) {
                temp.add(o);
            }
        }
        currentObstacles = temp;
    }

    /**
     * Accelerates the movement speed of the obstacles
     * 
     * @param a the acceleration to apply to the speed
     * @param t the time interval
     */
    public void accelerate(double a, int t) {
        speed += a * t / 1000;
    }

    /**
     * Returns the list of current obstacles.
     * 
     * @return the ArrayList of current Obstacle objects
     */
    public ArrayList<Obstacle> getObstacles() {
        return currentObstacles;
    }
}
