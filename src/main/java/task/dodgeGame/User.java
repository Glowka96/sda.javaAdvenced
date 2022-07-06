package task.dodgeGame;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import static task.dodgeGame.Movement.*;

public class User extends Characters {
    User(String aChar) {
        super(aChar);
    }



    @Override
    protected void movement() {
        Movement movement;
        System.out.println("Where do you want go? ");
        System.out.println(Arrays.toString(Movement.values()));
        String choice = userChoice();
        choice.equals(values());
       // switch (choice){
        //    case UP:


       // }
    }


    private String userChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            choice = scanner.nextLine();
        } while (!choice.matches("W | S | A | D"));
        return choice;
    }
}
