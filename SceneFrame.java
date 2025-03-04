import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;

class SceneFrame {

    private JFrame f;
    private SceneCanvas sc;
    private Timer repaintTimer;
    private long lastUpdate;

    public SceneFrame() {
        sc = new SceneCanvas();
        f = new JFrame();

        lastUpdate = System.currentTimeMillis();
        ActionListener repaint = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sc.isRunning()) {
                    int deltaTime = (int) (System.currentTimeMillis() - lastUpdate);
                    int prev = (int) sc.getScore() / 100;
                    sc.gameUpdate(deltaTime);
                    if ((int) sc.getScore() / 100 - prev == 1) {
                        playSound("point");
                    }
                    f.repaint();
                    lastUpdate = System.currentTimeMillis();
                }
            }
        };

        repaintTimer = new Timer(1000 / 60, repaint);
        repaintTimer.start();

        KeyListener jumpListener = new KeyListener() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_UP) {
                    sc.jump();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_KP_DOWN) {
                    sc.duck();
                }
                if (e.getKeyCode() == KeyEvent.VK_P) {
                    resetGame();

                }
            }

            public void keyTyped(KeyEvent e) {

            }

            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_KP_DOWN) {
                    sc.unDuck();
                }
            }
        };
        f.addKeyListener(jumpListener);
    }

    public void setUpGUI() {
        f.setTitle("Midterm Project - Canamo - Celestino");
        f.add(sc);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void playSound(String s) {
        String fileName;
        if (s.equalsIgnoreCase("jump")) {
            fileName = "sfx/jump.wav";
        } else if (s.equalsIgnoreCase("die")) {
            fileName = "sfx/die.wav";
        } else if (s.equalsIgnoreCase("point")) {
            fileName = "sfx/point.wav";
        } else {
            System.out.printf("Not a valid sound name: %s\n", s);
            return;
        }

        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName).getAbsoluteFile());
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            System.out.printf("Error playing sound %s", s);
        }
    }

    private void resetGame() {
        f.remove(sc);
        sc = new SceneCanvas();
        f.add(sc);
        f.revalidate();
        f.repaint();
        lastUpdate = System.currentTimeMillis();
    }

}