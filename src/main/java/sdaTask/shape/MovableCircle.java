package sdaTask.shape;

public class MovableCircle implements Movable {
    MovablePoint movablePoint;
    private double radius;

    public MovableCircle(MovablePoint movablePoint, double radius) {
        this.movablePoint = movablePoint;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        movablePoint.y += movablePoint.ySpeed;
    }

    @Override
    public void moveDown() {
        movablePoint.y -= movablePoint.ySpeed;
    }

    @Override
    public void moveLeft() {
        movablePoint.x += movablePoint.xSpeed;
    }

    @Override
    public void moveRight() {
        movablePoint.x -= movablePoint.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", radius=" + radius +
                '}';
    }
}
