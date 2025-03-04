import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Obstacle extends ParallaxObject {

    private int spriteIndex;
    private static ArrayList<PixelGrid> sprites = new ArrayList<>();

    public Obstacle(double y, double s, int i) {
        super((double) 800, y, s);
        spriteIndex = i;
        this.setPosition(800, this.getY() - sprites.get(spriteIndex).getHeight());
    }

    public static void setUpSprites() {
        Color[][] hydrant = {
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(255, 35, 2), new Color(255, 35, 2), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(255, 35, 2),
                        new Color(255, 35, 2), new Color(255, 35, 2), new Color(255, 79, 34), new Color(255, 79, 34),
                        new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(255, 79, 34), new Color(255, 79, 34),
                        new Color(255, 79, 34), new Color(255, 79, 34), new Color(255, 79, 34), new Color(255, 79, 34),
                        new Color(255, 79, 34), new Color(255, 79, 34), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(255, 35, 2), new Color(255, 35, 2), new Color(255, 35, 2),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0), new Color(157, 0, 0),
                        new Color(157, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(171, 28, 1), new Color(161, 27, 3),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(171, 27, 3), new Color(171, 27, 3),
                        new Color(171, 27, 3), new Color(171, 27, 3), new Color(171, 27, 3), new Color(135, 20, 2),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(253, 35, 2), new Color(171, 28, 1), new Color(161, 27, 3),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(253, 81, 34), new Color(253, 81, 34),
                        new Color(171, 27, 3), new Color(171, 27, 3), new Color(171, 27, 3), new Color(135, 20, 2),
                        new Color(135, 20, 2), new Color(0, 0, 0, 0) },
                { new Color(255, 255, 255), new Color(253, 35, 2), new Color(171, 28, 1), new Color(161, 27, 3),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(255, 255, 255),
                        new Color(255, 255, 255), new Color(135, 20, 2), new Color(135, 20, 2), new Color(135, 20, 2),
                        new Color(135, 20, 2), new Color(135, 20, 2), new Color(255, 255, 255) },
                { new Color(255, 255, 255), new Color(171, 28, 1), new Color(171, 28, 1), new Color(161, 27, 3),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(199, 199, 199),
                        new Color(199, 199, 199), new Color(108, 14, 0), new Color(108, 14, 0), new Color(108, 14, 0),
                        new Color(108, 14, 0), new Color(135, 20, 2), new Color(255, 255, 255) },
                { new Color(0, 0, 0, 0), new Color(171, 28, 1), new Color(171, 28, 1), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 81, 34), new Color(108, 14, 0), new Color(108, 14, 0),
                        new Color(108, 14, 0), new Color(108, 14, 0), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(135, 20, 2), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(171, 28, 1), new Color(171, 28, 1), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(136, 19, 2), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(171, 28, 1),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(253, 81, 34),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(253, 81, 34),
                        new Color(253, 81, 34), new Color(253, 35, 2), new Color(253, 35, 2), new Color(253, 35, 2),
                        new Color(253, 35, 2), new Color(108, 14, 0), new Color(136, 19, 2), new Color(0, 0, 0, 0),
                        new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(253, 81, 34), new Color(253, 81, 34), new Color(253, 81, 34),
                        new Color(171, 28, 1), new Color(171, 28, 1), new Color(171, 28, 1), new Color(171, 28, 1),
                        new Color(171, 28, 1), new Color(136, 19, 2), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(136, 19, 2), new Color(0, 0, 0, 0) },
                { new Color(0, 0, 0, 0), new Color(136, 19, 2), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(136, 19, 2), new Color(136, 19, 2), new Color(136, 19, 2), new Color(136, 19, 2),
                        new Color(136, 19, 2), new Color(136, 19, 2), new Color(108, 14, 0), new Color(108, 14, 0),
                        new Color(108, 14, 0), new Color(0, 0, 0, 0) } };
        sprites.add(new PixelGrid(0, 0, hydrant, 4));
    }

    @Override
    public void drawElements(Graphics2D g2d) {
        g2d.draw(getHitBox());
        sprites.get(spriteIndex).draw(g2d);
    }

    public void setSprite(int i) {
        spriteIndex = i;
    }

    public PixelGrid getSprite() {
        return sprites.get(spriteIndex);
    }

    public Rectangle2D getHitBox() {
        System.out.printf("X:%.1f Y:%.1f W:%.1f H:%.1f\n", this.getX(), this.getY(),
        sprites.get(spriteIndex).getWidth(),
        sprites.get(spriteIndex).getHeight());
        return new Rectangle2D.Double(this.getX(), this.getY(),
                sprites.get(spriteIndex).getWidth(),
                sprites.get(spriteIndex).getHeight());
    }

    public static int getNumSprites() {
        return sprites.size();
    }
}
