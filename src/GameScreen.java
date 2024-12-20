import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Purpose: Handles rendering the game on the screen.
public class GameScreen extends JComponent implements KeyListener {
    int apple_x, apple_y, snake_x, snake_y;
    Snake snake = new Snake(1, 2);

    public GameScreen() {
        setPreferredSize(new Dimension(500, 500));
    }

    //Draws the snake, fruits, and any additional UI elements.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //apple 
        g.setColor(Color.RED);
        apple_x = 1;
        apple_y = 2;
        g.fillOval(apple_x, apple_y, 10, 10);
        
        //snake 
        g.setColor(Color.GREEN);
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
        frame.addKeyListener(this);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        System.out.println("typed text: " + keyChar);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        System.out.println("key pressed: " + key);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == 38) 
            snake.direction = Snake.Direction.UP;
        if (key == 40)
            snake.direction = Snake.Direction.DOWN;
        if (key == 39)
            snake.direction = Snake.Direction.RIGHT;
        else if (key == 37)
            snake.direction = Snake.Direction.LEFT;
        
        System.out.println("key released: " + snake.getDirection());
    }

    // public int getAppleX() {
    //     return apple_x;
    // }

    // public int getAppleY() {
    //     return apple_y;
    // }

    // public int getSnakeX() {
    //     return snake_x;
    // }

    // public int getSnakeY() {
    //     return snake_y;
    // }

    // repaint(): Refreshes the screen to reflect the latest game state
    // https://www.javatpoint.com/repaint-method-in-java  
    // @Override
    // public void repaint() {
    //     repaint(getSnakeX()-1, getSnakeY()-1, getWidth() + 2, getHeight() + 2);
    //     System.out.println(getHeight() + 2);
    //     System.out.println(getHeight() + 2);
    // }

}

