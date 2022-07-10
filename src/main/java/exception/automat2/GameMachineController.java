package exception.automat2;

import exception.input.BookMappingException;

import java.io.FileNotFoundException;

public class GameMachineController {

    public static void main(String[] args) throws GameException, BookMappingException, FileNotFoundException {
        GameMachine gameMachine = new GameMachine();
        gameMachine.gameFromTheStore();
        gameMachine.showGameFromTheStore();
        gameMachine.buyingAgame();
    }
}

