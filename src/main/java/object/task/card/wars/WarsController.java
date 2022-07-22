package object.task.card.wars;

import object.task.card.Card;
import object.task.card.MechanicGameException;

public class WarsController {
    MechanicGameWars gameWar = new MechanicGameWars();
    private int i;
    private boolean endGame = false;

    public void startWars() throws MechanicGameException {
        int move = 0;
        gameWar.howManyPlayers(2);
        gameWar.addCardToPlayer(26);
        do {
            do {
                Card c1 = gameWar.getPlayers().get(0).getCardList().get(0);
                Card c2 = gameWar.getPlayers().get(1).getCardList().get(0);
                System.out.println(c1);
                System.out.println(c2);
                gameWar.placeBets();
                i = gameWar.whichCardIsStronger(c1, c2);
                gameWar.removePlayerFirstCard();
                System.out.println(i);
            } while (i == 0);
            gameWar.addCardsToWinner(i);
            gameWar.removeStack();
            System.out.println(gameWar.getPlayers().get(0).getCardList());
            System.out.println(gameWar.getPlayers().get(1).getCardList());
            endGame = gameWar.endgame();
            System.out.println(move++);
        } while (!endGame);
        System.out.println(gameWar.whoWinner());
    }
}
