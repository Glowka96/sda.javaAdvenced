package sdaTask.shape;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, Boolean fillingFigure, double width, double height) {
        super(color, fillingFigure);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    void area() {
        System.out.println(width * height);
    }

    @Override
    void getPerimeter() {
        System.out.println((2 * width) + (2 * height));
    }

    public String toString() {
        return String.format("Rectangle with width=%f and " +
                        "height=%f which is subclass off %s", width, height,
                super.toString());
    }
}
