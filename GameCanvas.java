import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameCanvas extends JPanel implements KeyListener {
  public static final double GRAVITY = 0.3;
  public static final double accel = 0.01;
  private int width;
  private int height;
  private Player player;
  private int speed;
  private Timer timer;
  private boolean isRunning;
  private int score;

  private GameConfig cfg;

  private Ground ground;
  private Mountain mountain;
  private BackMountain mountain2;
  private Background background;
  private JLabel scoreLabel;

  public GameCanvas(int w, int h) {
    speed = 10;
    width = w;
    height = h;
    player = new Player(100, h - 70);
    isRunning = true;
    score = 0;
    scoreLabel = new JLabel("tite");
    addKeyListener(this);
    cfg = new GameConfig();

    mountain = new Mountain(5, 110, cfg);
    mountain2 = new BackMountain(3, 100, cfg);
    background = new Background(0, 0, cfg);

    setFocusable(true);
    ground = new Ground(10, 550);
    add(scoreLabel);

  }

  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    background.draw(g2d);
    ground.draw(g2d);
    mountain2.draw(g2d);
    mountain.draw(g2d);
    player.draw(g2d);

  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      player.jump();
    }
  }

  public void updateGame() {
    cfg.setAcceleration(cfg.getAcceleration() + 0.02);
    cfg.setScore(cfg.getScore() + 1);
    scoreLabel.setText(String.format("%d", cfg.getScore()));
  }

  public boolean isRunning() {
    return isRunning;
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

  public void keyTyped(KeyEvent e) {
  }

}
