import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Background extends ParallaxObject implements ActionListener {
  private float cycleProgress = 0.0f; // Ranges from 0.0 (Day) to 1.0 (Night)
  private boolean isDayToNight = true;
  private Timer timer;

  public Background(int s, double y) {
    super(s, y);
    timer = new Timer(50, this); // Updates every 50ms
    timer.start();
  }

  @Override
  public void drawElements(Graphics2D g2d, double x, double y) {
    Rectangle bounds = g2d.getClipBounds();

    // Define colors for day and night gradients
    Color dayTop = new Color(135, 206, 250); // Sky Blue
    Color dayBottom = new Color(255, 223, 186); // Sunset Orange

    Color nightTop = new Color(25, 25, 112); // Midnight Blue
    Color nightBottom = new Color(0, 0, 32); // Darker Blue

    // Interpolate colors using cycleProgress
    int r1 = (int) ((1 - cycleProgress) * dayTop.getRed() + cycleProgress * nightTop.getRed());
    int g1 = (int) ((1 - cycleProgress) * dayTop.getGreen() + cycleProgress * nightTop.getGreen());
    int b1 = (int) ((1 - cycleProgress) * dayTop.getBlue() + cycleProgress * nightTop.getBlue());

    int r2 = (int) ((1 - cycleProgress) * dayBottom.getRed() + cycleProgress * nightBottom.getRed());
    int g2 = (int) ((1 - cycleProgress) * dayBottom.getGreen() + cycleProgress * nightBottom.getGreen());
    int b2 = (int) ((1 - cycleProgress) * dayBottom.getBlue() + cycleProgress * nightBottom.getBlue());

    Color topColor = new Color(r1, g1, b1);
    Color bottomColor = new Color(r2, g2, b2);

    // Apply animated gradient
    GradientPaint gradient = new GradientPaint(0, 0, topColor, 0, bounds.height, bottomColor);
    g2d.setPaint(gradient);
    g2d.fill(new Rectangle2D.Double(bounds.x, bounds.y, bounds.width, bounds.height));
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // Adjust the transition progress
    if (isDayToNight) {
      cycleProgress += 0.01f;
      if (cycleProgress >= 1.0f) {
        cycleProgress = 1.0f;
        isDayToNight = false;
      }
    } else {
      cycleProgress -= 0.01f;
      if (cycleProgress <= 0.0f) {
        cycleProgress = 0.0f;
        isDayToNight = true;
      }
    }

    // Request redraw (should be called from a component's repaint method)
    if (getParent() != null) {
      getParent().repaint();
    }
  }
}
