package object.reapet.line;

public class Rectangle {
    int weight;
    int height;
    String symbol;

    Rectangle(int weight, int height, String symbol){
        this.weight = weight;
        this.height = height;
        this.symbol = symbol;
    }

    void printRectangle(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
