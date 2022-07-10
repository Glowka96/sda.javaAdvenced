package object.task.dodgeGame;

import java.util.Arrays;
import java.util.Scanner;

import static object.task.dodgeGame.Movement.*;

public class User extends Characters {
    Movable movable;

    User(String aChar) {
        super(aChar);
    }


    @Override
    protected void movement() {
        System.out.println("Where do you want go? ");
        System.out.println(Arrays.toString(Movement.values()));
        String choice = userChoice();
        Movement movement = Movement.valueOf(choice.toUpperCase());
        switch (movement){
            case UP:
                //int x = getX();
                //setX(x++);
                System.out.println("UP");
            case DOWN:
                break;
            case LEFT:
                break;
            case RIGHT:
                break;
        }
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
