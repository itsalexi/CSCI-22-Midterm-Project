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
    private ObstacleGenerator obstacleGenerator;
    private double time;

    public SceneCanvas() {
        this.setPreferredSize(new Dimension(800, 600));
        time = 0;
        player = new Player(50, 570);
        obstacleGenerator = new ObstacleGenerator(570, 200);
        Obstacle.setUpSprites();

        score = 1;
        baseSpeed = 10;
        running = true;
        lastObstacle = 0;

        objects = new ArrayList<>();
        obstacles = new ArrayList<>();

        // add objects by increasing z-order here
        objects.add(new Background(50, 0));
        objects.add(new Sky(50, 0));
        objects.add(new BackBuilding(200, 0));
        objects.add(new FrontBuilding(300, 0));
        objects.add(new Ground(400, 0));
        objects.add(new Menu());
        objects.add(obstacleGenerator);
        objects.add(player);

    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (DrawingObject o : objects) {
            o.draw(g2d);
        }
        obstacleGenerator.draw(g2d);
    }

    public void gameUpdate(int t) {
        lastObstacle += t;
        for (DrawingObject o : objects) {
            o.update(t);
        }
        obstacleGenerator.update(t);
        for (Obstacle o : obstacleGenerator.getObstacles()) {
            if (o.getHitBox().intersects(player.getHitBox())) {
                running = false;
                player.die();
            }
        }
        if (lastObstacle > 3000) {
            obstacleGenerator.generate();
            lastObstacle = 0;
        }
    }

    public void toggleRunning() {
        running = !running;
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

    public double getScore() {
        return score;
    }
}