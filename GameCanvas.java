import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameCanvas extends JPanel implements KeyListener {
  public static final double GRAVITY = 0.3;
  private int width;
  private int height;
  private Player player;
  private int speed;
  private Timer timer;
  private boolean isRunning;
  private int score;

  private Ground ground;
  private Mountain mountain;
  private BackMountain mountain2;
  private Background background;

  public GameCanvas(int w, int h) {
    speed = 10;
    width = w;
    height = h;
    player = new Player(100, h - 70);
    isRunning = true;
    score = 0;
    addKeyListener(this);
    mountain = new Mountain(5, 110);
    mountain2 = new BackMountain(3, 100);
    background = new Background(0, 0);
    setFocusable(true);
    ground = new Ground(10, 550);
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

  public void updateGame(){
    score += (int) speed/10;
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
