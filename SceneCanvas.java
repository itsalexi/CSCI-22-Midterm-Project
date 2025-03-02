import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SceneCanvas extends JComponent{

    private ArrayList<DrawingObject> objects;
    private double score, baseSpeed;
    private JLabel scoreLabel, gameOverLabel;
    private Player player;
    private boolean running;
    
    public SceneCanvas(){
        this.setPreferredSize(new Dimension(800, 600));
        player = new Player(100, 300);

        score = 1;
        baseSpeed = 10;
        running = true;

        objects = new ArrayList<>();

        // add objects by increasing z-order here
        objects.add(player);
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        for(DrawingObject o : objects){
            o.draw(g2d);
        }
    }

    public void gameUpdate(int t){
        for(DrawingObject o : objects){
            o.update(t);
            if(o instanceof Obstacle){

            }
        }

    }

    public void jump(){
        player.jump();
    }

    public boolean isRunning(){
        return running;
    }
}