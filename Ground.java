import java.awt.*;
import java.awt.geom.*;

public class Ground extends DrawingObject{


  public Ground(int s, double y) {
    super(s, y);
  }

  public void drawElements(Graphics2D g2d, double x, double y){
    Rectangle2D.Double ground = new Rectangle2D.Double();
    g2d.draw(ground);
  }

  @Override
  public void draw(Graphics2D g){
    
  }

}
