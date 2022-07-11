package object.task.hunterGame;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static List<Characters> players = new ArrayList<>();
    static char[][] boardGame = new char[10][10];
    private static List<List<String>> board = new ArrayList<>();

    public static void main(String[] args) {
        //showBoard();
        printBoardGame();

        User user = new User('X');
        User user1 = new User('a');
        User user2 = new User('v');
        User user3 = new User('d');
        User user4 = new User('q');
        User user5 = new User('P');
        players.add(user);
        players.add(user1);
        players.add(user2);
        players.add(user3);
        players.add(user4);
        players.add(user5);
        showBoard();


        setBoardGame(user.y, user.x);
        System.out.println(user.x);
        System.out.println(user.y);
        boardGame[user.y][user.x] = user.getaChar();

        for (int i = 0; i < boardGame.length; i++) {
            for (int j = 0; j < boardGame.length; j++) {
                System.out.print(boardGame[i][j]);
            }
        }
    }
    static void printBoardGame(){
        User user = new User('X');
        User user1 = new User('a');
        User user2 = new User('v');
        User user3 = new User('d');
        User user4 = new User('q');
        User user5 = new User('P');
        players.add(user);
        players.add(user1);
        players.add(user2);
        players.add(user3);
        players.add(user4);
        players.add(user5);
        setBoardGame(user.y, user.x);
        for (char[] chars :
                boardGame) {
            for (char c :
                    chars) {
                if(c != 0) {
                    System.out.print(user.getaChar());
                    continue;
                }
                System.out.print(".");
            }
            System.out.println();
        }
    }

    static void showBoard() {
        for (int i = 0; i < players.size(); i++) {
            int x = players.get(i).x;
            int y = players.get(i).y;
            //boardGame[y][x] == players.get(i).getaChar();
        }

    }

    public static void setPlayers(List<Characters> players) {
        Game.players = players;
    }

    public static void setBoardGame(int x, int y) {
        Game.boardGame[y][x] = 'X';
    }

}

