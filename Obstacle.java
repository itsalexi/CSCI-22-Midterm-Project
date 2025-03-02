import java.awt.*;
import java.util.ArrayList;

public class Obstacle extends DrawingObject {
    private double speed;

    private int spriteIndex;
    private ArrayList<int[][]> sprites;

    public Obstacle(int s, double y) {
        super(s, y);
        spriteIndex = 0;
        sprites = new ArrayList<>();
    }

    @Override
    public void drawElements(Graphics2D g2d) {

    };

    public void setSprite(int i){
        spriteIndex = i;
    }
}
