import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

public class Cloud extends DrawingObject {
  private int spriteIndex;
  private ArrayList<PixelGrid> sprites;

  public Cloud(double x, double y, int i) {
    super(x, y);
    spriteIndex = i;
    sprites = new ArrayList<>();

    Color[][] cloud1 = {
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(150, 203, 237, 120),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
            new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(150, 203, 237, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(150, 203, 237, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(223, 229, 243, 120), new Color(223, 229, 243, 120), new Color(223, 229, 243, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(0, 0, 0, 0), new Color(0, 0, 0, 0) },
        { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(150, 203, 237, 120), new Color(150, 203, 237, 120),
            new Color(150, 203, 237, 120), new Color(0, 0, 0, 0) } };
    Color[][] cloud2 = {{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(0, 0, 0, 0)},{new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(0, 0, 0, 0)},{new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(0, 0, 0, 0)},{new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(223, 229, 243, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(0, 0, 0, 0)},{new Color(0, 0, 0, 0),new Color(0, 0, 0, 0),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(150, 203, 237, 120),new Color(0, 0, 0, 0),new Color(0, 0, 0, 0)}};
    sprites.add(new PixelGrid(0, 0, cloud1, 5));
    sprites.add(new PixelGrid(0, 0, cloud2, 5));

  }

  @Override
  public void drawElements(Graphics2D g2d) {
    AffineTransform reset = g2d.getTransform();
    g2d.translate(0, -sprites.get(spriteIndex).getHeight());
    sprites.get(spriteIndex).draw(g2d);
    g2d.setTransform(reset);
  }

  public double getWidth() {
    return sprites.get(spriteIndex).getWidth();
  }

  public double getHeight() {
    return sprites.get(spriteIndex).getHeight();
  }

  public void setSprite(int i) {
    spriteIndex = i;
  }

  public int getSprite() {
    return spriteIndex;
  }

  public PixelGrid getSprite(int i) {
    return sprites.get(i);
  }
}
