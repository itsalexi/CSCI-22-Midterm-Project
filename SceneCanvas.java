
/**
 * The SceneCanvas class represents the game scene in the window.
 * It is responsible for drawing all objects, updating the game state, 
 * and handling interactions between the player and the obstacles.
 * It also handles the time of day and displays the score.
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
import java.awt.geom.Rectangle2D;
import java.util.*;
import javax.swing.*;

public class SceneCanvas extends JComponent {

    private ArrayList<DrawingObject> objects;
    private double score;
    private Player player;
    private boolean running;
    private int lastObstacle;
    private ObstacleGenerator obstacleGenerator;
    private double time, speed;
    private ArrayList<ParallaxObject> parallax;
    private boolean dayToNight;
    private JLabel scoreLabel;
    private Sun sun;

    /**
     * Constructs the SceneCanvas object, initializing game objects, parallax
     * objects,
     */
    public SceneCanvas() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(null);
        scoreLabel = new JLabel("", SwingConstants.RIGHT);
        scoreLabel.setBounds(590, 10, 200, 30);
        add(scoreLabel);
        player = new Player(50, 570);
        obstacleGenerator = new ObstacleGenerator(570, 200);
        Obstacle.setUpSprites();

        score = 1;
        running = true;
        lastObstacle = 0;
        time = 0;
        speed = 1000 / 30;
        dayToNight = false;

        objects = new ArrayList<>();
        parallax = new ArrayList<>();

        Background bg = new Background(50, 0);
        BackBuilding bb = new BackBuilding(100, 0);
        FrontBuilding fb = new FrontBuilding(200, 0);
        Ground g = new Ground(300, 0);
        sun = new Sun(20, 20, 40, 40);

        parallax.add(bg);
        parallax.add(bb);
        parallax.add(fb);
        parallax.add(g);

        // add objects by increasing z-order here
        objects.add(bg);
        objects.add(bb);
        objects.add(fb);
        objects.add(g);
        objects.add(sun);
        objects.add(obstacleGenerator);
        objects.add(player);

    }

    /**
     * Paints the scene by drawing all objects on the canvas.
     * 
     * @param g the Graphics object used to draw the scene
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (DrawingObject o : objects) {
            o.draw(g2d);
        }
        obstacleGenerator.draw(g2d);
    }

    /**
     * Updates the game state by accelerating the player, adding time, checking
     * collisions,
     * generating new obstacles, and updating the day-night cycle. It also updates
     * the score.
     * 
     * @param t the time interval
     */
    public void gameUpdate(int t) {
        scoreLabel.setText(String.format("%d", (int) score));

        lastObstacle += t;
        accelerate(1, t);
        addTime(t);
        for (DrawingObject o : objects) {
            o.update(t);
        }
        for (ParallaxObject o : parallax) {
            o.setTime(time);
            o.accelerate(10, t);
        }
        obstacleGenerator.update(t);
        for (Obstacle o : obstacleGenerator.getObstacles()) {
            Rectangle2D obstacleHitbox = o.getHitBox();
            Rectangle2D playerHitbox = player.getHitBox();

            if (!(playerHitbox.getX() + playerHitbox.getWidth() <= obstacleHitbox.getX() ||
                    playerHitbox.getX() >= obstacleHitbox.getX() + obstacleHitbox.getWidth() ||
                    playerHitbox.getY() + playerHitbox.getHeight() <= obstacleHitbox.getY() ||
                    playerHitbox.getY() >= obstacleHitbox.getY() + obstacleHitbox.getHeight())) {
                running = false;
                player.die();
            }

        }
        if (lastObstacle > 3000) {
            obstacleGenerator.generate();
            lastObstacle = 0;
        }

        if (dayToNight) {
            scoreLabel.setForeground(Color.WHITE);
        } else {
            scoreLabel.setForeground(Color.BLACK);
        }
    }

    /**
     * Sets the running state of the game.
     * 
     * @param b true if the game is running, false otherwise
     */
    public void setRunning(boolean b) {
        running = b;
    }

    /**
     * Makes the player jump.
     */
    public void jump() {
        player.jump();
    }

    /**
     * Makes the player duck.
     */
    public void duck() {
        player.duck();
    }

    /**
     * Makes the player stop ducking.
     */
    public void unDuck() {
        player.unDuck();
    }

    /**
     * Returns whether the game is still running.
     * 
     * @return true if the game is running, false otherwise
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Returns the current score of the game.
     * 
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * Accelerates the game speed based on the given acceleration and elapsed time.
     * 
     * @param a the acceleration to apply
     * @param t the time interval
     */
    public void accelerate(double a, int t) {
        speed += a * t / 1000;
    }

    /**
     * Adds time to the game and adjusts the day-night cycle based on the speed.
     * It also increases the score as the game progresses.
     * 
     * @param t the time interval
     */
    public void addTime(int t) {
        if (!dayToNight) {
            time += speed * t / 500000;
        } else {
            time -= speed * t / 500000;
        }

        if (time > 1) {
            dayToNight = true;
            time = 1;
        } else if (time < 0) {
            dayToNight = false;
            time = 0;
        }

        if (time > 0.7) {
            sun.setAlpha(0);
        } else {
            sun.setAlpha((0.35 - Math.abs(time - 0.35)) * (1 / 0.35));
        }

        score += speed / 200;
    }
}