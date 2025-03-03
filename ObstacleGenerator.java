import java.awt.*;
import java.util.*;

public class ObstacleGenerator extends DrawingObject{
    private ArrayList<Obstacle> currentObstacles;
    private double speed;

    public ObstacleGenerator(double y, double s){
        super(0, y);
        speed = s;
        currentObstacles = new ArrayList<>();
    }

    public void drawElements(Graphics2D g2d){
        for(Obstacle o : currentObstacles){
            o.draw(g2d);
        }
    }

    public void generate(){
        currentObstacles.add(new Obstacle(this.getY(), speed, (int) (Math.random() * Obstacle.getNumSprites())));
    }

    public void update(int t){
        for(Obstacle o : currentObstacles){
            o.setPosition(o.getX() - speed * t / 1000, this.getY());
            System.out.println(o.getX());
        }

        ArrayList<Obstacle> temp = new ArrayList<>();
        for(Obstacle o : currentObstacles){
            if(o.getX() + o.getSprite().getWidth() > 0){
                temp.add(o);
            }
        }
        currentObstacles = temp;
    }

    public void accelerate(double a, int t){
        speed += a * t / 1000;
    }

    public ArrayList<Obstacle> getObstacles(){
        return currentObstacles;
    }
}
