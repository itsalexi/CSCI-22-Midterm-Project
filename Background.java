import java.awt.*;
import java.awt.geom.*;

public class Background extends ParallaxObject{
  private int[][] starPositions = {
      { 50, 50 }, { 100, 80 }, { 200, 30 }, { 300, 60 },
      { 400, 90 }, { 500, 40 }, { 600, 70 }, { 700, 20 }
  };

  public Background(int s, double y) {
    super(0, y, s);
  }

  @Override
  public void drawElements(Graphics2D g2d) {
    Color dayTop = new Color(135, 206, 250);
    Color dayBottom = new Color(255, 223, 186);

    Color nightTop = new Color(50, 0, 69);
    Color nightBottom = new Color(124, 11, 55);

    int r1 = (int) ((1 - this.getTime()) * dayTop.getRed() + this.getTime() * nightTop.getRed());
    int g1 = (int) ((1 - this.getTime()) * dayTop.getGreen() + this.getTime() * nightTop.getGreen());
    int b1 = (int) ((1 - this.getTime()) * dayTop.getBlue() + this.getTime() * nightTop.getBlue());

    int r2 = (int) ((1 - this.getTime()) * dayBottom.getRed() + this.getTime() * nightBottom.getRed());
    int g2 = (int) ((1 - this.getTime()) * dayBottom.getGreen() + this.getTime() * nightBottom.getGreen());
    int b2 = (int) ((1 - this.getTime()) * dayBottom.getBlue() + this.getTime() * nightBottom.getBlue());

    Color topColor = new Color(r1, g1, b1);
    Color bottomColor = new Color(r2, g2, b2);

    GradientPaint gradient = new GradientPaint(0, 0, topColor, 0, 600, bottomColor);
    g2d.setPaint(gradient);
    g2d.fill(new Rectangle2D.Double(0, 0, 800, 600));

    if (this.getTime() > 0.5) {
      drawStars(g2d, (int) this.getX(), (int) this.getY());
    }

  }

  private void drawStars(Graphics2D g2d, int x, int y) {
    g2d.setColor(Color.white);
    for (int[] pos : starPositions) {
      int starX = pos[0];
      int starY = pos[1];
      g2d.fillOval(starX + x, starY + y, 3, 3);
    }
  }
}
