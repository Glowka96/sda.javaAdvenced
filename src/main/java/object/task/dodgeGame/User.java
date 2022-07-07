package object.task.dodgeGame;

import java.util.Arrays;
import java.util.Scanner;

import static object.task.dodgeGame.Movement.*;

public class User extends Characters {
    User(String aChar) {
        super(aChar);
    }


    @Override
    protected void movement() {
        Movement movement;
        Movable movable = new Movable();
        System.out.println("Where do you want go? ");
        System.out.println(Arrays.toString(Movement.values()));
        String choice = userChoice();

    }

    private String userChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            choice = scanner.nextLine();
        } while (choice.equals(values()));
        return choice;
    }
}
