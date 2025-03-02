import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Obstacle extends ParallaxObject {
    private double speed;

    private int spriteIndex;
    private ArrayList<PixelGrid> sprites;

    public Obstacle(double y, double s) {
        super((double) 800, y, s);
        spriteIndex = 0;
        sprites = new ArrayList<>();

        this.setPosition(800, this.getY() - sprites.get(spriteIndex).getHeight());
    }

    @Override
    public void drawElements(Graphics2D g2d) {

    };

    public void setSprite(int i){
        spriteIndex = i;
    }

    public Rectangle2D getHitBox(){
        return new Rectangle2D.Double(this.getX(), this.getY(), sprites.get(spriteIndex).getWidth(), sprites.get(spriteIndex).getHeight());
      }
}
