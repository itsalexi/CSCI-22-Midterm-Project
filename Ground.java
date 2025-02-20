
import java.awt.*;
import java.awt.geom.Line2D;

public class Ground {
  private double speed;
  private int deltaX;

  public Ground(double s) {
    speed = s;
  }

  public void draw(Graphics2D g2d) {
    Line2D.Double ground = new Line2D.Double(0, 400, 800, 400);

    for (int i = 0; i < 10; i++) {
      int pebbleX = (int) (Math.random() * 800);
      int pebbleY = 400 + (int) (Math.random() * 10);
      g2d.fillOval(pebbleX, pebbleY, 5, 5);
    }
    g2d.setColor(Color.BLACK);
    g2d.fill(ground);
  }

}
