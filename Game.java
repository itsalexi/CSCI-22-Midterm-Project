import javax.swing.JFrame;

public class Game {
  public static void main(String[] args) {

    int w = 640;
    int h = 480;
    JFrame f = new JFrame();
    GameCanvas gc = new GameCanvas(w, h);

    f.add(gc);
    f.setSize(w, h);
    f.setTitle("Midterm Project");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
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
