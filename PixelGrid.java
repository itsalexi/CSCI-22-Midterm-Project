import java.awt.*;

public class PixelGrid extends DrawingObject{

    private int[][] grid;
    private double pixelSize;
    private Color[] colors;
    public PixelGrid(double x, double y, int[][] g, double p, Color[] c){
        super(x, y);
        grid = g;
        pixelSize = p;
        colors = c;
    }

    public void drawElements(Graphics2D g2d){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    new Square(j * pixelSize, i * pixelSize, pixelSize, colors[grid[i][j] - 1]).draw(g2d);
                }
            }
        }
    }

    public double getWidth(){
        return grid[0].length * pixelSize;
    }

    public double getHeight(){
        return grid.length * pixelSize;
    }
}
