import java.awt.Graphics2D;
import java.util.ArrayList;

public class Sky extends ParallaxObject {
  private ArrayList<DrawingObject> objects;

  public Sky(int s, double y) {
    super(0, y, s);
    objects = new ArrayList<>();

    objects.add(new Cloud(50, 100, 0));
    objects.add(new Cloud(60, 127, 1));
    objects.add(new Cloud(100, 80, 0));
    objects.add(new Cloud(250, 98, 1));
    objects.add(new Cloud(320, 115, 0));
    objects.add(new Cloud(350, 110, 0));
    objects.add(new Cloud(310, 90, 1));
    objects.add(new Cloud(432, 135, 1));
    objects.add(new Cloud(475, 100, 0));
    objects.add(new Cloud(550, 115, 0));
    objects.add(new Cloud(585, 105, 1));
    objects.add(new Cloud(640, 136, 0));
    objects.add(new Cloud(625, 126, 1));
    objects.add(new Cloud(686, 115, 1));
    objects.add(new Cloud(712, 165, 0));
    objects.add(new Cloud(743, 126, 1));

    objects.add(new Cloud(800, 110, 1));

  }

  @Override
  public void drawElements(Graphics2D g2d) {
    for (DrawingObject o : objects) {
      o.draw(g2d);
    }

  }
}
