import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.Timer;

public class Background extends DrawingObject implements ActionListener {
  private double cycleProgress;
  private boolean isDayToNight;
  private Timer timer;

  private int[][] starPositions = {
      { 50, 50 }, { 100, 80 }, { 200, 30 }, { 300, 60 },
      { 400, 90 }, { 500, 40 }, { 600, 70 }, { 700, 20 }
  };

  public Background(int s, double y) {
    super(0, y, s);
    cycleProgress = 0;
    isDayToNight = false;
    timer = new Timer(100, this);
    timer.start();
  }

  @Override
  public void drawElements(Graphics2D g2d) {
    int newDelay = Math.max(1, timer.getDelay() - ((int) cfg.getAcceleration() / 100));
    timer.setDelay(newDelay);
    Color dayTop = new Color(135, 206, 250);
    Color dayBottom = new Color(255, 223, 186);

    Color nightTop = new Color(50, 0, 69);
    Color nightBottom = new Color(124, 11, 55);

    int r1 = (int) ((1 - cycleProgress) * dayTop.getRed() + cycleProgress * nightTop.getRed());
    int g1 = (int) ((1 - cycleProgress) * dayTop.getGreen() + cycleProgress * nightTop.getGreen());
    int b1 = (int) ((1 - cycleProgress) * dayTop.getBlue() + cycleProgress * nightTop.getBlue());

    int r2 = (int) ((1 - cycleProgress) * dayBottom.getRed() + cycleProgress * nightBottom.getRed());
    int g2 = (int) ((1 - cycleProgress) * dayBottom.getGreen() + cycleProgress * nightBottom.getGreen());
    int b2 = (int) ((1 - cycleProgress) * dayBottom.getBlue() + cycleProgress * nightBottom.getBlue());

    Color topColor = new Color(r1, g1, b1);
    Color bottomColor = new Color(r2, g2, b2);

    GradientPaint gradient = new GradientPaint(0, 0, topColor, 0, 428, bottomColor);
    g2d.setPaint(gradient);
    g2d.fill(new Rectangle2D.Double(0, 0, 800, 428));
    drawClouds(g2d, (int) x, (int) y);

    if (cycleProgress > 0.5) {
      drawStars(g2d, (int) x, (int) y);
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

  private void drawClouds(Graphics2D g2d, int x, int y) {
    g2d.setColor(new Color(255, 255, 255, 100));
    g2d.fillOval(100 + x, 60 + y, 80, 40);
    g2d.fillOval(150 + x, 50 + y, 100, 50);
    g2d.fillOval(220 + x, 60 + y, 80, 40);
    g2d.fillOval(200 + x, 80 + y, 80, 40);
    g2d.fillOval(350 + x, 60 + y, 100, 50);
    g2d.fillOval(320 + x, 70 + y, 80, 40);

    g2d.fillOval(450 + x, 40 + y, 90, 50);
    g2d.fillOval(550 + x, 80 + y, 110, 60);
    g2d.fillOval(650 + x, 50 + y, 100, 50);
    g2d.fillOval(50 + x, 100 + y, 120, 60);
    g2d.fillOval(700 + x, 90 + y, 80, 40);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (isDayToNight) {
      cycleProgress += 0.005;
      if (cycleProgress >= 1) {
        cycleProgress = 1;
        isDayToNight = false;
      }
    } else {
      cycleProgress -= 0.005;
      if (cycleProgress <= 0) {
        cycleProgress = 0;
        isDayToNight = true;
      }
    }
  }
}
