import java.awt.*;

public class Stars extends ParallaxObject{

    private double alpha;

    private int[][] starPositions = {
        { 50, 50 }, { 100, 80 }, { 200, 30 }, { 300, 60 },
        { 400, 90 }, { 500, 40 }, { 600, 70 }, { 700, 20 }
    };

    public Stars(double y){
        super(0, y, 0);
        alpha = 0;
    }
    
    public void drawElements(Graphics2D g2d) {
        g2d.setColor(new Color(255, 255, 255, (int) (255 * alpha)));
        for (int[] pos : starPositions) {
        int starX = pos[0];
        int starY = pos[1];
        g2d.fillOval(starX, starY, 3, 3);
        }
    }   
    
    public void setAlpha(double a){
        alpha = a;
    }
}
