package object.task.hunterGame;

import object.task.dodgeGame.Choice;

import java.util.Arrays;
import java.util.Scanner;

import static object.task.dodgeGame.Movement.values;

public class User extends Characters implements Movement {

    public User(String aChar) {
        super(aChar);
    }

    @Override
    public void movement() {
        System.out.println("Where do you want go? ");
        System.out.println(Arrays.toString(Choice.values()));
        String choice = userChoice();
        switch (choice) {
            case "W":
                y++;
            case "S":
                y--;
            case "A":
                x--;
            case "D":
                x++;
        }
    }

    @Override
    public void checkMoveAdd() {

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
