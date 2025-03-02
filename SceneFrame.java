import java.awt.event.*;
import javax.swing.*;

class SceneFrame{

    private JFrame f;
    private SceneCanvas sc;
    private Timer repaintTimer;
    private long lastUpdate;

    public SceneFrame(){
        sc = new SceneCanvas();
        f = new JFrame();

        lastUpdate = System.currentTimeMillis();
        ActionListener repaint = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(sc.isRunning()){
                    int deltaTime = (int) (System.currentTimeMillis() - lastUpdate);
                    sc.gameUpdate(deltaTime);
                    f.repaint();
                    lastUpdate = System.currentTimeMillis();
                }
            }
        };
        repaintTimer = new Timer(1000/60, repaint);
        repaintTimer.start();

        KeyListener jumpListener = new KeyListener(){
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_SPACE){
                    sc.jump();
                }
            }
            public void keyTyped(KeyEvent e){}
            public void keyReleased(KeyEvent e){}
        };
        f.addKeyListener(jumpListener);
    }

    public void setUpGUI(){
        f.setTitle("Midterm Project - Canamo - Celestino");
        f.add(sc);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}