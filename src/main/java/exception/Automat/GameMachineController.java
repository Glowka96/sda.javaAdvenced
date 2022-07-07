package exception.Automat;

public class GameMachineController {

    public static void main(String[] args) throws GameException {
        Game game = new Game("Wiedzmin", 40);
        Game game1 = new Game("Elder Ring", 259);
        Game game2 = new Game("Fifa 22", 179);
        Game game3 = new Game("UFC 22", 229);
        Game game4 = new Game("Assasin", 239);
        GameMachine gameMachine = new GameMachine(game, game1, game2, game3, game4);

        System.out.println(gameMachine);
        gameMachine.buyingAgame();

    }




}

