package exception.automat2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GameMachine {
    private List<Game> gameList = new ArrayList<>();
    private List<Game> searchedGame = new ArrayList<>();
    private List<Game> purchasedGame = new ArrayList<>();
    private Game findGame;
    private int profit;

    public void addGameToSearchedGame(String title) throws GameMachineException {
        Pattern pattern = Pattern.compile(title);
        boolean isValidName = false;
        Matcher matcher;
        for (Game game :
                gameList) {
            matcher = pattern.matcher(game.getTitle().toLowerCase());
            if (matcher.find()) {
                searchedGame.add(game);
                isValidName = true;
            }
        }
        if (!isValidName) {
            throw new GameMachineException("We don't have the game");
        }
    }

    public void getGame(int number) throws GameMachineException {
        try {
            findGame = searchedGame.get(number);
        } catch (Exception e) {
            throw new GameMachineException("Number oversize");
        }
    }

    public int getPrice(int money) throws GameMachineException {
        int price = findGame.getPrice();
        if (price <= money) {
            purchasedGame.add(findGame);
            profit += price;
        } else {
            throw new GameMachineException("Not enough money");
        }
        return price;
    }

    public void gameFromTheStore() throws GameMappingException {
        File file = new File("src\\main\\java\\exception\\automat2\\games");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Game game = mapLineToGame(line);
                gameList.add(game);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Game mapLineToGame(String line) throws GameMappingException {
        try {
            String[] elements = line.split("; ");
            String title = elements[0];
            int price = Integer.parseInt(elements[1]);
            return new Game(title, price);
        } catch (Exception exception) {
            throw new GameMappingException("Incorrect file format !!!! for the line: " + line, line);
        }
    }

    public List<Game> getPurchasedGame() {
        return purchasedGame;
    }

    public List<Game> getSearchedGame() {
        return searchedGame;
    }

    public List<Game> getGameList() {
        return gameList;
    }

    public int getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "" + gameList;
    }
}
