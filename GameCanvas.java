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

  private Ground ground;
  private Mountain mountain;
  private BackMountain mountain2;
  private Background background;

  public GameCanvas(int w, int h) {
    speed = 10;
    width = w;
    height = h;
    player = new Player(100, h - 70, 32);
    isRunning = true;
    addKeyListener(this);
    mountain = new Mountain(5, 110);
    mountain2 = new BackMountain(3, 100);
    background = new Background(0, 0);
    setFocusable(true);
    ground = new Ground(10);
  }

  public void updateGame() {
    if (player.posY < height - 70) {
      player.accelerate(0, -GRAVITY);
    }
    player.update();
    if (player.posY > height - 70) {
      player.setPosition(player.posX, height - 70);
      player.setSpeedY(0);
    }
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
      if (player.speedY == 0) {
        player.accelerate(0, 10);

      }
    }
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
