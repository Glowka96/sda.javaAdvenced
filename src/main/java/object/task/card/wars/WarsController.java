package object.task.card.wars;

import object.task.card.Card;
import object.task.card.MechanicCard;
import object.task.card.MechanicCards;

import java.util.ArrayList;
import java.util.List;

public class WarsController {
    MechanicCard mechanicCard = new MechanicCard();

    private List<Card> playerOne = new ArrayList<>();
    private List<Card> playerTwo = new ArrayList<>();
    private int i;
    private boolean endGame = false;

    public void startWars() {
        int count;
        do {
            count = 0;
            do {
                Card c1 = mechanicCard.getPlayerOne().get(count);
                Card c2 = mechanicCard.getPlayerTwo().get(count);
                System.out.println(c1);
                System.out.println(c2);
                playerOne.add(c1);
                playerTwo.add(c2);
                i = mechanicCard.whichCardIsStronger(c1,c2);
                count++;
            } while (i == 0);
            mechanicCard.placeBets(i, playerOne, playerTwo);
            playerOne.clear();
            playerTwo.clear();
            endGame = mechanicCard.endGame();
        } while (!endGame);
        int whoWinner = mechanicCard.whoWinner();
        if(whoWinner == 1) {
            System.out.println("Winner player one");
        } else {
            System.out.println("Winner player two");
        }
    }
}
