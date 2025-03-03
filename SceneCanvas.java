import java.awt.*;
import java.util.*;
import javax.swing.*;

public class SceneCanvas extends JComponent {

    private ArrayList<DrawingObject> objects;
    private double score, baseSpeed;
    private JLabel scoreLabel, gameOverLabel;
    private Player player;
    private boolean running;
    private int lastObstacle;
    private ArrayList<Obstacle> obstacles;

    public SceneCanvas() {
        this.setPreferredSize(new Dimension(800, 600));
        player = new Player(100, 300);

        score = 1;
        baseSpeed = 10;
        running = true;
        lastObstacle = 0;

        objects = new ArrayList<>();
        obstacles = new ArrayList<>();

        // add objects by increasing z-order here
        objects.add(new Background(50, 0));
        objects.add(new Mountain(200, 0));
        objects.add(new BackMountain(300, 0));
        objects.add(new Ground(50, 0));

        objects.add(player);

    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (DrawingObject o : objects) {
            o.draw(g2d);
        }
        for (DrawingObject o : obstacles) {
            o.draw(g2d);
        }
    }

    public void gameUpdate(int t) {
        lastObstacle += t;
        for (DrawingObject o : objects) {
            o.update(t);
        }
        for (Obstacle o : obstacles) {
            o.update(t);
            if (o.getHitBox().intersects(player.getHitBox())) {
                running = false;
                player.die();
            }
        }
        if (lastObstacle > 1000) {
            // random obstacle logic
        }
    }

    public void jump() {
        player.jump();
    }

    public void duck() {
        player.duck();
    }

    public void unDuck() {
        player.unDuck();
    }

    public boolean isRunning() {
        return running;
    }
}