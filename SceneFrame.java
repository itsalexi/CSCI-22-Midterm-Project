
/**
 * The SceneFrame class represents the window for the game scene. It sets up the JFrame,
 * manages the game canvas (SceneCanvas), and handles game updates (such as score changes, 
 * player movements, and sound effects). It also listens for player input for actions like 
 * jumping and ducking, and updates the game state.
 * 
 * @author Alexi Roth Luis A. Canamo (245333)
 * @author Kenaz R. Celestino (241051)
 * @version March 5, 2025
 * 
 * I have not discussed the Java language code in my program 
 * with anyone other than my instructor or the teaching assistants 
 * assigned to this course.
 * 
 * I have not used Java language code obtained from another student, 
 * or any other unauthorized source, either modified or unmodified.
 * 
 * If any Java language code or documentation used in my program 
 * was obtained from another source, such as a textbook or website, 
 * that has been clearly noted with a proper citation in the comments 
 * of my program.
 **/
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;

class SceneFrame {

    private JFrame f;
    private SceneCanvas sc;
    private Timer repaintTimer;
    private long lastUpdate;

    /**
     * Constructs the SceneFrame object. Initializes the game canvas, sets up
     * the timer for game updates, and adds the key listener for player controls.
     */

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

    /**
     * Sets up the GUI
     */
    public void setUpGUI() {
        f.setTitle("Midterm Project - Canamo - Celestino");
        f.add(sc);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    /**
     * Plays the sound associated with the specified event.
     * 
     * @param s the name of the sound
     */
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

    /**
     * Resets the game by removing the current SceneCanvas, creating a new one,
     * and updating the frame.
     */
    private void resetGame() {
        f.remove(sc);
        sc = new SceneCanvas();
        f.add(sc);
        f.revalidate();
        f.repaint();
        lastUpdate = System.currentTimeMillis();
    }

}