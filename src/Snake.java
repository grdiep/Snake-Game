
public class Snake {
    
    // List<Point> body; //coords of snake body 
    Direction direction; //direction of snake movmt 
    int x, y, width, height; //(x, y) coords 
    
    public Snake(int x, int y) {
        this.x = x;
        this.y = y;
        direction = Direction.DOWN;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y; 
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
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