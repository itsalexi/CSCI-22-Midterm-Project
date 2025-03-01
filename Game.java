import javax.swing.JFrame;

public class Game {
  public static void main(String[] args) {

    int w = 800;
    int h = 600;
    JFrame f = new JFrame();
    GameCanvas gc = new GameCanvas(h);

    f.add(gc);
    f.setSize(w, h);
    f.setTitle("Midterm Project");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setResizable(false);
    long initial = System.currentTimeMillis();

    while (gc.isRunning()) {
      long current = System.currentTimeMillis();
      if (current - initial > 1000 / 60) {
        gc.updateGame();
        f.repaint();
        initial = current;
      }
    }
  }
}
