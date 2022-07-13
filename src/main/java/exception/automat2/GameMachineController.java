package exception.automat2;

import java.util.List;
import java.util.Scanner;

public class GameMachineController {
    GameMachine gameMachine = new GameMachine();
    private boolean isContinue;

    public void startAutomat() {
        int count = 0;
        do {
            try {
                if(count == 0) {
                    gameMachine.gameFromTheStore();
                    count++;
                }
                automatMenu();
            } catch (GameMappingException | GameMachineException e) {
                System.out.println(e.getMessage());
            } finally {
                isContinue = isContinueShop();
                if (isContinue) {
                    gameMachine.getSearchedGame().clear();
                } else {
                    System.out.println("You bought game: ");
                    showGames(gameMachine.getPurchasedGame());
                    System.out.println("Thank you for shopping");
                    System.out.println("Shop profit: " + gameMachine.getProfit());
                }
            }
        } while (isContinue);
    }

    public void automatMenu() throws GameMachineException {
        showGames(gameMachine.getGameList());
        System.out.println("Which game you want to buy? ");
        String title = printNameGameForUser();
        gameMachine.addGameToSearchedGame(title);
        System.out.println("For how much do you want to buy?");
        int money = printNumberForUser();
        showGames(gameMachine.getSearchedGame());
        System.out.println("Which game you want to buy? ");
        int numberChoice = printNumberForUser();
        gameMachine.getGame(numberChoice);
        int price = gameMachine.getPrice(money);
        System.out.println("You bought game, your rest: " + (money - price));
    }

    private String printNameGameForUser() {
        Scanner scanner = new Scanner(System.in);
        String nameGame;
        do {
            nameGame = scanner.nextLine();
            nameGame.matches("\\D");
        } while (nameGame.matches("\\D"));
        return nameGame.toLowerCase();
    }

    private int printNumberForUser() throws GameMachineException {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            throw new GameMachineException("Error! You don't entered number");
        }
        return number;
    }

    private boolean isContinueShop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You want to continue shop? yes/no");
        String choice;
        do {
            choice = scanner.nextLine().toLowerCase();
        } while (choice.matches("yes | no"));
        return choice.equals("yes");
    }

    private void showGames(List<Game> gameList) {
        int count = 0;
        for (Game game :
                gameList) {
            System.out.println(count++ + ". " + game);
        }
    }
}

