import java.awt.*;

public abstract class ParallaxObject {
  private double speed;
  private double offsetX = 0;
  private double offsetY = 0;

  public ParallaxObject(int s, double y) {
    speed = s;
    offsetY = y;
  }

  public void draw(Graphics2D g2d) {
    drawElements(g2d, offsetX, offsetY);
    drawElements(g2d, offsetX + 800, offsetY);
    offsetX -= speed;
    if (offsetX <= -800) {
      offsetX = 0;
    }
  }

  public abstract void drawElements(Graphics2D g2d, double x, double y);

}
