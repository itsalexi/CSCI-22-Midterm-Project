import java.awt.Graphics2D;
import java.util.ArrayList;

public class Sky extends ParallaxObject {
  private ArrayList<DrawingObject> objects;

  public Sky(int s, double y) {
    super(0, y, s);
    objects = new ArrayList<>();

    objects.add(new Cloud(50, 100, 0));
    objects.add(new Cloud(100, 125, 0));
    objects.add(new Cloud(250, 135, 1));

  }

  @Override
  public void drawElements(Graphics2D g2d) {
    for (DrawingObject o : objects) {
      o.draw(g2d);
    }

  }
}
