import java.awt.event.KeyEvent;

public class Snake {
    
    // List<Point> body; //coords of snake body 
    Direction direction; //direction of snake movmt 
    int x; //x axis coord
    int y; //y axis coord 
    
    public Snake(int x, int y) {
        this.x = x;
        this.y = y;
        // body.add(new Point(this.x, this. y));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y; 
    }

    public Direction getDirection() {
        return direction;
    }

    //moves snake in curr direction 
    public void move() {
        switch (direction) {
            case Direction.UP -> y -= 1;
            case Direction.DOWN -> y += 1;
            case Direction.LEFT -> x -= 1;
            case Direction.RIGHT -> x += 1;
        }
    }

    //key listener for when user clicks & releases arrow keys
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_KP_UP) 
            direction = Direction.UP;
        if (key == KeyEvent.VK_KP_DOWN)
            direction = Direction.DOWN;
        if (key == KeyEvent.VK_KP_RIGHT)
            direction = Direction.RIGHT;
        else 
            direction = Direction.LEFT;
    }

    //grow snake body if it eats apple 
    public void grow() { 

        // body.add(new Point(this.x, this. y));
    }

    //check if snake is colliding w/ itself
    public boolean checkSelfCollision() {
        return false;
    }

    public enum Direction {
        UP,
        DOWN,
        RIGHT,
        LEFT;
    }
}
