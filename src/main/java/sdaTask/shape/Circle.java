package sdaTask.shape;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean fillingFigure, int radius) {
        super(color, fillingFigure);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle with radius " + radius + " which is a subclass off " + toString();
    }
}
