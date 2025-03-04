import java.awt.*;
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
        Sky sky = new Sky(50, 0);
        BackBuilding bb = new BackBuilding(100, 0);
        FrontBuilding fb = new FrontBuilding(200, 0);
        Ground g = new Ground(300, 0);
        parallax.add(bg);
        parallax.add(sky);
        parallax.add(bb);
        parallax.add(fb);
        parallax.add(g);

        // add objects by increasing z-order here
        objects.add(bg);
        objects.add(sky);
        objects.add(bb);
        objects.add(fb);
        objects.add(g);
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
        scoreLabel.setText(String.format("%d", (int) score));

        lastObstacle += t;
        accelerate(1, t);
        addTime(t);
        System.out.println(score);
        for (DrawingObject o : objects) {
            o.update(t);
        }
        for (ParallaxObject o : parallax) {
            o.setTime(time);
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

        if (dayToNight) {
            scoreLabel.setForeground(Color.WHITE);
        } else {
            scoreLabel.setForeground(Color.BLACK);
        }
    }

    public void setRunning(boolean b) {
        running = b;
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

    public void accelerate(double a, int t) {
        speed += a * t / 1000;
    }

    public void addTime(int t) {
        if (!dayToNight) {
            time += speed * t / 1000000;
        } else {
            time -= speed * t / 1000000;
        }
        if (time > 1) {
            dayToNight = true;
            time = 1;
        } else if (time < 0) {
            dayToNight = false;
            time = 0;
        }
        score += speed / 100;
    }
}