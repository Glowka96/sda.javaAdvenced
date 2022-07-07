package sdaTask.shape;

public class Main {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(10, 10, 2, 2);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint);
        Movable movableCircle = new MovablePoint(50, 50, 5, 5);
        System.out.println(movableCircle);
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movableCircle);
    }
}
