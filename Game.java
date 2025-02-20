import javax.swing.JFrame;

public class Game {
  public static void main(String[] args) {
    int w = 640;
    int h = 480;
    final int FPS = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getRefreshRate();
    JFrame f = new JFrame();
    GameCanvas gc = new GameCanvas(w, h);

    f.add(gc);
    f.setSize(w, h);
    f.setTitle("Midterm Project");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);

  }
}
