import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.*;

class SceneFrame{

    private JFrame f;
    private SceneCanvas sc;
    private Timer repaintTimer;
    private long lastUpdate;
    private boolean isRunning;

    public SceneFrame(){
        sc = new SceneCanvas();
        f = new JFrame();
        isRunning = true;

        lastUpdate = System.currentTimeMillis();
        ActionListener repaint = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(sc.isRunning()){
                    int deltaTime = (int) (System.currentTimeMillis() - lastUpdate);
                    sc.gameUpdate(deltaTime);
                    f.repaint();
                    lastUpdate = System.currentTimeMillis();
                } else {
                    isRunning = false;
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

    public void playSound(String s){
        String fileName;
        if(s.equalsIgnoreCase("jump")){
            fileName = "sfx/jump.wav";
        }else if(s.equalsIgnoreCase("die")){
            fileName = "sfx/die.wav";
        }else if(s.equalsIgnoreCase("point")){
            fileName = "sfx/point.wav";
        } else {
            System.out.printf("Not a valid sound name: %s\n", s);
            return;
        }

        try{
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName).getAbsoluteFile());
            clip.open(inputStream);
            clip.start();
        } catch (Exception e){
            System.out.printf("Error playing sound %s", s);
        }
    }
}