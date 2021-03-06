package exception.Automat;

public class Game {
    private String title;
    private int price;

    Game() {

    }
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game title: " + title + " price: " + price + "\n";
    }
}
