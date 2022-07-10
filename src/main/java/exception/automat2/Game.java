package exception.automat2;

public class Game {
    private String title;
    private int price;

    Game(String title, int price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Game title: " + title + " price: " + price;
    }
}
