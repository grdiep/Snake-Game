import java.awt.Point;
import java.util.List;

public class Snake {
    
    List<Point> body; //coords of snake body 
    Direction direction; //direction of snake movmt 
    
    public Snake(Point point, Direction direction) {
        body.add(point);
        this.direction = direction;
    }

    public void move() {

    }

    public void grow() { 

    }

    public boolean checkSelfCollision() {
        return false;
    }
}
