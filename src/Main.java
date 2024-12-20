

public class Main {
    public static void main(String[] args) {
        GameScreen screen = new GameScreen();
        screen.createScreen();
        Grid grid = new Grid(10, 10);
        // screen.repaint();
        
        Snake snake = new Snake(3, 5);
        System.out.println("(" + snake.getX() + ", " + snake.getY() + ")");
        snake.move();
        System.out.println("(" + snake.getX() + ", " + snake.getY() + ")");

        // System.out.println("repainted");


        // Snake snake = new Snake(3, 5);
        // snake.move();

        // while (!grid.outOfBoundsCheck(new Point(x, y)) && !snake.checkSelfCollision()) {
        //     snake.move();
        //     System.out.println("moved");
        //     // snake.grow();
        // }

    }
}
