package exception.Automat;

import exception.input.Book;
import exception.input.BookMappingException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameMachine {
    private List<Game> gameList;
    private Game game;

    public GameMachine(Game... games) {
        gameList = List.of(games);
    }

    void buyingAgame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which game you want to buy? ");
        String name = scanner.nextLine();
        System.out.println("For how much do you want to buy?");
        int money = scanner.nextInt();
        int price;
        try {
            game = getGame(name);
            price = getPrice(money, game);
            System.out.println("You bought game, your rest: " + (money - price));
        } catch (GameException e) {
            System.out.println(e.getMessage());
        }
    }


    private Game getGame(String name) throws GameException {
        Game game1 = null;
        try {
            for (Game aGame :
                    gameList) {
                String title = aGame.getTitle();
                if (title.equals(name)) {
                    game1 = aGame;
                    break;
                }
            }
            if (game1 == null) {
                throw new GameException("Don't have game");
            }
        } catch (Exception e) {
            throw new GameException("Don't have game");
        }
        return game1;
    }


    private int getPrice(int money, Game game) throws GameException {
        int price = game.getPrice();
        if(price <= money) {
            return price;
        } else {
            throw new GameException("Not enough money");
        }
    }

    @Override
    public String toString() {
        return "GameMachine{" +
                "gameList=" + gameList +
                ", game=" + game +
                '}';
    }
}
