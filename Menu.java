
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Menu extends DrawingObject {
  private boolean isVisible;

  public Menu() {
    super(0, 0);
    isVisible = true;
  }

  @Override
  public void drawElements(Graphics2D g2d) {
    if (isVisible) {
      g2d.setColor(new Color(0, 0, 0, 100));
      g2d.fill(new Rectangle2D.Double(0, 0, 800, 600));
    }
  }

}