
public class Main {
    public static void main(String[] args) {
        GameScreen screen = new GameScreen();
        screen.createScreen();

        Grid grid = new Grid(10, 10);

        // Snake snake = new Snake(3, 5);
        // int x = snake.getX();
        // System.out.println(x);
        // int y = snake.getY();
        // System.out.println(y);

        //issue: everytime I bring the screen back, the coordinates of the UI move FIX!

        // while (!grid.outOfBoundsCheck(new Point(x, y)) && !snake.checkSelfCollision()) {
        //     snake.move();
        //     System.out.println("moved");
        //     // snake.grow();
        // }

    }
}
