package exception.automat2;

import exception.input.BookMappingException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GameMachine {
    private List<Game> gameList = new ArrayList<>();
    private SearchGame gameSearch = new SearchGame();
    private Game findGame;

    public GameMachine(){

    }

    public GameMachine(Game... games) {
        gameList = List.of(games);
    }

    void buyingAgame() {
        gameSearch.searchGame();
        try {
            getGame();
            getPrice();
        } catch (GameException e) {
            System.out.println(e.getMessage());
            buyingAgame();
        }
    }

    private void getGame() throws GameException {
        Pattern pattern;
        Matcher matcher = null;
        for (Game aGame :
                gameList) {
            pattern = Pattern.compile(findGame.getTitle());
            pattern.matcher(aGame.getTitle());
            if (matcher.find()) {
                findGame = aGame;
                System.out.println("Okey, i have the game.");
                break;
            } else {
                throw new GameException("Don't have game");
            }
        }
    }

    private void getPrice() throws GameException {
        int price = findGame.getPrice();
        int money = gameSearch.game.getPrice();
        if (price <= money) {
            System.out.println("You bought game, your rest: " + (money - price));
        } else {
            throw new GameException("Not enough money");
        }
    }

    public void gameFromTheStore() throws FileNotFoundException, BookMappingException {
        File file = new File("C:\\Users\\glowa\\IdeaProjects\\SDA-java\\javaAdvanced\\src\\main\\java\\exception\\automat2\\games");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Game game = mapLineToBook(line);
                gameList.add(game);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not fide");
            e.printStackTrace();
        }
    }

    public Game mapLineToBook(String line) throws BookMappingException {
        try {
            String[] elements = line.split("; ");
            String title = elements[0];
            int price = Integer.parseInt(elements[1]);
            Game game = new Game(title, price);
            return game;
        } catch (Exception exception) {
            throw new BookMappingException("Incorrect file format !!!! for the line: " + line, line);
        }
    }

    public void showGameFromTheStore(){
        for (Game game :
                gameList) {
            System.out.println(game);
        }
    }

    @Override
    public String toString() {
        return "" + gameList;
    }
}
