import java.awt.*;

public abstract class 
ParallaxObject {
  private double speed;
  private GameConfig cfg;
  private double offsetX = 0;
  private double offsetY = 0;

  public ParallaxObject(int s, double y, GameConfig c) {
    speed = s;
    offsetY = y;
    cfg = c;
  }

  public void draw(Graphics2D g2d) {
    drawElements(g2d, offsetX, offsetY);
    drawElements(g2d, offsetX + 800, offsetY);
    offsetX -= speed * (1 + (cfg.getAcceleration() / 100));
    if (offsetX <= -800) {
      offsetX = 0;
    }
  }

  public abstract void drawElements(Graphics2D g2d, double x, double y);

}
