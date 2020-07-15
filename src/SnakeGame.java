import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//Keylistener lets us take input from the keyboard

public class SnakeGame extends Applet implements Runnable, KeyListener {


    public void init() {
        this.resize(400, 400);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 400);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void repaint(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
