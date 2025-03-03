import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Obstacle extends ParallaxObject{

    private int spriteIndex;
    private static ArrayList<PixelGrid> sprites = new ArrayList<>();

    public Obstacle(double y, double s, int i) {
        super((double) 800, y, s);
        spriteIndex = i;
        this.setPosition(800, this.getY() - sprites.get(spriteIndex).getHeight());
    }

    public static void setUpSprites(){
        Color[][] obstacleTest = {{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)},{new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0),new Color(0, 0, 0)}};
        sprites.add(new PixelGrid(0, 0, obstacleTest, 5));
    }

    @Override
    public void drawElements(Graphics2D g2d) {
        sprites.get(spriteIndex).draw(g2d);
    }

    public void setSprite(int i){
        spriteIndex = i;
    }

    public PixelGrid getSprite(){
        return sprites.get(spriteIndex);
    }

    public Rectangle2D getHitBox(){
        return new Rectangle2D.Double(this.getX(), this.getY(), sprites.get(spriteIndex).getWidth(), sprites.get(spriteIndex).getHeight());
    }

    public static int getNumSprites(){
        return sprites.size();
    }
}
