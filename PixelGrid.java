import java.awt.*;

public class PixelGrid extends DrawingObject {

    private Color[][] grid;
    private double pixelSize;

    public PixelGrid(double x, double y, Color[][] g, double p) {
        super(x, y);
        grid = g;
        pixelSize = p;
    }

    public void drawElements(Graphics2D g2d) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                new Square(j * pixelSize, i * pixelSize, pixelSize, grid[i][j]).draw(g2d);
            }
        }
    }

    public double getWidth() {
        return grid[0].length * pixelSize;
    }

    public double getHeight() {
        return grid.length * pixelSize;
    }
}
