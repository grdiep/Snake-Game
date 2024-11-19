
import java.awt.Point;

public class Grid {
    //logic, nothing that is displayed in the front end 
    int height, width;

    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public boolean  outOfBoundsCheck(Point point) {
        return point.getX() <= width && point.getY() <= height;
    }

    //TODO: check if cell is occurpied by snake/fruit 
    public void isCellOccupied(Point point) {

    }
}
