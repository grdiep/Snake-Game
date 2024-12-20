
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

    public boolean outOfBoundsCheck(Point point) {
        return point.getX() <= width && point.getY() <= height;
    }

    public int getX(Point point) {
        return (int) point.getX();
    }

    public int getY(Point point) {
        return (int) point.getY();
    }

    //TODO: check if cell is occurpied by snake/fruit
    public void isCellOccupied(Point point) {
        if (getX(point) == 0) {
        }
    }
}
