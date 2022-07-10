package exception.automat2;

import java.util.Scanner;

public class SearchGame {
    Game game;

    public void searchGame() {
        String name = printNameGameForUser();
        int userMoney = printUserMoney();
        game = new Game(name, userMoney);
    }

    private String printNameGameForUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which game you want to buy? ");
        String nameGame;
        do {
            nameGame = scanner.nextLine();
            nameGame.matches("\\D");
        } while (nameGame.matches("\\D"));
        return nameGame.toLowerCase();
    }

    private int printUserMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For how much do you want to buy?");
        int userMoney;
        try {
            userMoney = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            return printUserMoney();
        }
        return userMoney;
    }
}
