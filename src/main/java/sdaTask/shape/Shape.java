package sdaTask.shape;

public abstract class Shape {
    String color;
    Boolean fillingFigure;

    public Shape(){
        color = "unknown";
        fillingFigure = false;
    }

    public Shape(String color, Boolean fillingFigure) {
        this.color = color;
        this.fillingFigure = fillingFigure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFillingFigure() {
        return fillingFigure;
    }

    public void setFillingFigure(Boolean fillingFigure) {
        this.fillingFigure = fillingFigure;
    }

    abstract void area();

    abstract void getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s",
                color, fillingFigure ? "filled" : "NotFilled");
    }
}
