package object.task.dodgeGame;

import java.util.ArrayList;
import java.util.List;

public class Game {
    static int x = 0, y = 2;
    static int x1 = 6, y1 = 1;
    static int x2 = 3, y2 = 2;
    static int x3 = 7, y3 = 3;

    static User user2 = new User("X");
    static User user5 = new User("P");
    static List<Characters> characters = new ArrayList<>();

    public static void main(String[] args) {
        User user = new User("x");
        user.movement();
        Movement movement;
        String name = "A";

        characters.add(user);
        characters.add(user5);
        characters.add(user2);
        //System.out.println(Movement.valueOf(name));


        for (int i = 0; i < 5; i++) {
            showBoard();
            x++;
            System.out.println();
            if (x == x2 && y == y2) {
                System.out.println("game over");
                break;
            }
            if (i % 2 == 0) {
                x1++;
            }
        }
    }


    static void showBoard() {
        for (int i = 0; i < 10; i++) {
            for (Characters characters1 : characters) {
                if (characters1.y == i) {
                    for (int j = 0; j < 10; j++) {
                        if (characters1.x == j) {
                            System.out.print(x);
                            break;
                        }
                    }
                    System.out.print(".");
                }
            }
        }
    }
}
