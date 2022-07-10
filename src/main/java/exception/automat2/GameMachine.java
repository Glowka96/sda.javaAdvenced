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
    private List<Game> searchedGame = new ArrayList<>();
    private SearchGame gameSearch = new SearchGame();
    private List<Game> purchasedGame = new ArrayList<>();
    private Game findGame;
    private int profit;

    public GameMachine(){

    }

    void buyingAgame() throws GameExceptionValidTitle {
        showGameFromTheStore();
        gameSearch.searchGame();
        addGameToSearchedGame();
        try {
            getGame();
            showSearchedGame();
            getPrice();
        } catch (GameExceptionValidTitle | GameExceptionValidMoney e) {
            System.out.println(e.getMessage());
        } finally {
            boolean isContinue = isContinueShop();
            searchedGame.clear();
            if(isContinue) {
                buyingAgame();
            } else {
                System.out.println("Thank you for shopping");
                showPurchasedGames();
            }
        }
    }
    
    private void addGameToSearchedGame() throws GameExceptionValidTitle {
        String title = gameSearch.game.getTitle();
        Pattern pattern = Pattern.compile(title);
        boolean isValidName = false;
        Matcher matcher;
        for (Game game :
                gameList) {
            matcher = pattern.matcher(game.getTitle());
            if(matcher.find()){
                searchedGame.add(game);
            }
        }
        if(!isValidName) {
            throw new GameExceptionValidTitle("We don't have the game");
        }
    }

    private void getGame() throws GameExceptionValidTitle {
        showSearchedGame();
        try{
            int number = printNumberGameForUser();
            findGame = searchedGame.get(number);
        } catch (GameExceptionValidChoiceNumber e) {
            System.out.println(e.getMessage());
        }
    }

    private int printNumberGameForUser() throws GameExceptionValidChoiceNumber {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which game do you choose?");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            throw new GameExceptionValidChoiceNumber("Error! You don't entered number");
        }
        return number;
    }

    private void getPrice() throws GameExceptionValidMoney {
        int money = gameSearch.game.getPrice();
        int price = findGame.getPrice();
        System.out.println(price);
        if (money <= price) {
            System.out.println("You bought game, your rest: " + (money - price));
            searchedGame.add(findGame);
            profit += price;
        } else {
            throw new GameExceptionValidMoney("Not enough money");
        }
    }

    public void gameFromTheStore() throws BookMappingException {
        File file = new File("src\\main\\java\\exception\\automat2\\games");
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

    private boolean isContinueShop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You want to continue shop? yes/no");
        String choice;
        do {
            choice = scanner.nextLine().toLowerCase();
        } while (choice.matches("yes | no"));
        return choice.equals("yes");
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

    public void showSearchedGame(){
        int count = 0;
        for (Game game :
                searchedGame) {
            System.out.println(count++ + ". " + game);
        }
    }

    public void showPurchasedGames(){
        for (Game game :
                purchasedGame) {
            System.out.println(game);
        }
    }

    public int getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "" + gameList;
    }
}
