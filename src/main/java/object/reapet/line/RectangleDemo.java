package object.reapet.line;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,5, "*");
        Rectangle rectangle2 = new Rectangle(5,10, "$");
        rectangle1.printRectangle();
        System.out.println();
        rectangle2.printRectangle();
    }
}
