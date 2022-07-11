package exception.automat2;

public class GameMachineController {

    public static void main(String[] args) throws GameExceptionValidTitle, GameMappingException {
        GameMachine gameMachine = new GameMachine();
        gameMachine.gameFromTheStore();
        gameMachine.buyingAgame();

        System.out.println("Shop's profit: " + gameMachine.getProfit());
    }
}

