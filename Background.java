import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.Timer;

public class Background extends ParallaxObject implements ActionListener {
  private double cycleProgress;
  private boolean isDayToNight;
  private GameConfig cfg;
  private Timer timer;

  public Background(int s, double y, GameConfig c) {
    super(s, y, c);
    cycleProgress = 0;
    isDayToNight = false;
    timer = new Timer(100, this);
    timer.start();
    cfg = c;
  }

  @Override
  public void drawElements(Graphics2D g2d, double x, double y) {
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
