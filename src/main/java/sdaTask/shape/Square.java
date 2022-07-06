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
}
