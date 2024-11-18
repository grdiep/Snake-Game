import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen extends JComponent {
    //Purpose: Handles rendering the game on the screen.

    public GameScreen() {
        setPreferredSize(new Dimension(1000, 1000));
    }

    public int randomGenerator() {
        int num = (int) (Math.random() * 100);
        return num;
    }

    // paintComponent(Graphics g): Draws the snake, fruits, and any additional UI elements.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //apple 
        g.setColor(Color.RED);
        g.fillOval(randomGenerator(), randomGenerator(), 10, 50);
        
        //snake 
        g.setColor(Color.GREEN);
        g.fillRect(randomGenerator(), randomGenerator(), 10, 100);
    }

    public void createScreen() {
        JFrame frame = new JFrame("Snake Game");
        JPanel panel = new JPanel(); 
        panel.add(new GameScreen());
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // repaint(): Refreshes the screen to reflect the latest game state
    // https://www.javatpoint.com/repaint-method-in-java


    public static void main(String[] args) {
        GameScreen screen = new GameScreen();
        screen.createScreen();
    }
}

