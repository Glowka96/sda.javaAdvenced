package sdaTask.shape;

public class Square extends Rectangle{
    public Square(double width) {
        super(width, width);
    }

    public Square(String color, Boolean fillingFigure, double width) {
        super(color, fillingFigure, width, width);
    }

    @Override
    void area() {
        super.area();
    }

    @Override
    void getPerimeter() {
        super.getPerimeter();
    }

    public String toString() {
        return String.format("Square with width=%f and height=%f " +
                "which is subclass off %s", width, height, super.toString());
    }
}
