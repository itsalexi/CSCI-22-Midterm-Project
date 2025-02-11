import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameCanvas extends JPanel implements KeyListener {

  private int width;
  private int height;
  private Player player;
  private int speed;
  private Timer timer;

  public GameCanvas(int w, int h) {
    speed = 10;
    width = w;
    height = h;
    player = new Player(100, height, 32);
    addKeyListener(this);
    setFocusable(true);
    timer = new Timer(16, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        updateGame();
        repaint();
      }
    });
    timer.start();
  }

  private void updateGame() {
    player.update();
  }

  protected void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    player.draw(g2d);
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      player.move(speed, 0);
    }
    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      player.move(-speed, 0);
    }
    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      if (player.speedY == 0) {
        player.accelerate(0, 10);
      }
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

}
