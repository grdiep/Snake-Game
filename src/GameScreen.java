import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen extends JComponent {
    //Purpose: Handles rendering the game on the screen.
    int apple_x, apple_y, snake_x, snake_y;

    public GameScreen() {
        setPreferredSize(new Dimension(1000, 1000));
    }

    // public int randomGenerator() {
    //     int num = (int) (Math.random() * 100);
    //     return num;
    // }

    // paintComponent(Graphics g): Draws the snake, fruits, and any additional UI elements.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //apple 
        g.setColor(Color.RED);
        // g.fillOval(randomGenerator(), randomGenerator(), 10, 10);
        // apple_x = randomGenerator();
        // apple_y = randomGenerator();
        apple_x = 1;
        apple_y = 2;
        g.fillOval(apple_x, apple_y, 10, 10);
        
        //snake 
        g.setColor(Color.GREEN);
        // g.fillRect(randomGenerator(), randomGenerator(), 10, 10);
        // snake_x = randomGenerator();
        // snake_y = randomGenerator();
        snake_x = 40;
        snake_y = 100;
        g.fillRect(snake_x, snake_y, 50, 10);
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

    //TODO first: create a repaint() funct! 
     
    // repaint(): Refreshes the screen to reflect the latest game state
    // https://www.javatpoint.com/repaint-method-in-java  
}

