
import java.awt.Point;

public class Grid {
    //logic, nothing that is displayed on the front end 
    int height, width;

    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean  outOfBoundsCheck(Point point) {
        return point.getX() <= width && point.getY() <= height;
    }

    //TODO: check if cell is occurpied by snake/fruit
    public void isCellOccupied(Point point) {

    }
}
