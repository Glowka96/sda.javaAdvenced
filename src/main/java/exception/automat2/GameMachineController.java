package exception.automat2;

import exception.input.BookMappingException;

import java.io.FileNotFoundException;

public class GameMachineController {

    public static void main(String[] args) throws GameExceptionValidTitle, BookMappingException, FileNotFoundException {
        GameMachine gameMachine = new GameMachine();
        gameMachine.gameFromTheStore();
        gameMachine.buyingAgame();

        System.out.println(gameMachine.getProfit());
    }
}

