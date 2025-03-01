import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SceneCanvas extends JComponent{

    private ArrayList<DrawingObject> objects;
    private double score, baseSpeed;
    private JLabel scoreLabel, gameOverLabel;
    
    public SceneCanvas(){
        this.setPreferredSize(new Dimension(800, 600));

        score = 1;
        baseSpeed = 0.01;

        objects = new ArrayList<>();

        // add objects by increasing z-order here
        objects.add(new Mountain(100, 0.1));

    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        for(DrawingObject o : objects){
            o.drawElements(g2d);
        }
    }

    public void gameUpdate(int t){
        
    }
}
