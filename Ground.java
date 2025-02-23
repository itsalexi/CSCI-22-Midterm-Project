
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class Ground {
  private double speed;

  private static ArrayList<Pebble> pebbles = new ArrayList<>();

  public Ground(int s) {
    speed = s;
    for (int i = 0; i < 25; i++) {
      int pebbleX = (int) (Math.random() * 800);
      int pebbleY = 550 + (int) (Math.random() * 10);
      int size = (int) (Math.random() * 20);
      Ground.pebbles.add(new Pebble(pebbleX, pebbleY, size));
    }
  }

  public void draw(Graphics2D g2d) {
    Line2D.Double ground = new Line2D.Double(0, 550, 800, 525);

    for (Pebble pebble : pebbles) {
      System.out.println(pebble.getX() + " " + pebble.getY());
      pebble.setPosition(pebble.getX() - (int) speed, pebble.getY());
      g2d.fillOval(pebble.getX(), pebble.getY(), pebble.getSize(), 5);

      if (pebble.getX() <= 0) {
        pebble.setPosition(800, pebble.getY());
      }
    }

    g2d.draw(ground);
  }

}
