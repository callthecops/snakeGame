import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

//Jpanel creates a panel and Keylistener let us implement keys from the Keyboard

public class GamePlay extends JPanel implements KeyListener, ActionListener {

    private ImageIcon titleImage;

    //All the axis variables
    private int[] snakeXLength = new int[750];
    private int[] snakeYLength = new int[750];

    //All the snake movement direction variables
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;

    //All the snake image variables
    private ImageIcon rightMouth;
    private ImageIcon leftMouth;
    private ImageIcon upMouth;
    private ImageIcon downMouth;
    private ImageIcon snakeImage;

    //This class manages the speed of the snake inside the panel
    private Timer timer;
    private int delay = 100;

    public GamePlay() {

    }


    //This method draws everything on the panel
    public void paint(Graphics g) {
        //draw title image border
        g.setColor(Color.WHITE);
        g.drawRect(24, 10, 851, 55);

        //draw the title image
        titleImage = new ImageIcon("snaketitle.jpg");
        titleImage.paintIcon(this, g, 25, 11);

        //draw border for gameplay
        g.setColor(Color.WHITE);
        g.drawRect(24, 74, 851, 577);

        //draw background for gameplay
        g.setColor(Color.black);
        g.drawRect(25, 75, 850, 575);
    }

}
