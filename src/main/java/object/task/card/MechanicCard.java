package object.task.card;

import object.reapet.cars.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MechanicCard {
    private static final List<Card> cardList = createPackOfCards();
    private final List<Card> playerOne;
    private final List<Card> playerTwo;
    private Card card = new Card();

    public MechanicCard() {
        playerOne = dealTheCardWarsOne();
        playerTwo = dealTheCarWarsTwo();
    }

    public static List<Card> createPackOfCards() {
        List<Card> packOfCards = new ArrayList<>();
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                packOfCards.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(packOfCards);
        return packOfCards;
    }

    public static List<Card> dealTheCardWarsOne() {
        List<Card> cardList1 = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            cardList1.add(cardList.get(i));
        }
        return cardList1;
    }

    public static List<Card> dealTheCarWarsTwo() {
        List<Card> cardList2 = new ArrayList<>();
        for (int i = 26; i < 52; i++) {
            cardList2.add(cardList.get(i));
        }
        return cardList2;
    }

    public void placeBets(int i, List<Card> playerOne, List<Card> playerTwo) {
        if (i == 1) {
            getPlayerOne().addAll(playerTwo);
            getPlayerTwo().removeAll(playerTwo);
            getPlayerOne().removeAll(playerOne);
            getPlayerOne().addAll(playerOne);
        } else if (i == 2) {
            getPlayerTwo().addAll(playerOne);
            getPlayerOne().removeAll(playerOne);
            getPlayerTwo().removeAll(playerTwo);
            getPlayerTwo().addAll(playerTwo);
        }
    }

    public int whichCardIsStronger(Card c1, Card c2) {
        return card.witchIsStronger(c1, c2);
    }

    public int whoWinner(){
        return playerOne.size() == 0 ? 1 : 2;
    }


    public boolean endGame(){
        return playerOne.size() == 0 || playerTwo.size() == 0;
    }


    /*public int placeBets() {
        int count = 0;
        int i;
        List<Card> playerOne = new ArrayList<>();
        List<Card> playerTwo = new ArrayList<>();
        do {
            Card c1 = getPlayerOne().get(count);
            Card c2 = getPlayerTwo().get(count);
            playerOne.add(c1);
            playerTwo.add(c2);
            i = card.witchIsStronger(c1, c2);
            if (i == 1) {
                getPlayerOne().addAll(playerTwo);
                getPlayerTwo().removeAll(playerTwo);
                getPlayerOne().removeAll(playerOne);
                getPlayerOne().addAll(playerOne);
                return 1;
            } else if (i == 2) {
                getPlayerTwo().addAll(playerOne);
                getPlayerOne().removeAll(playerOne);
                getPlayerTwo().removeAll(playerTwo);
                getPlayerTwo().addAll(playerTwo);
                return 2;
            }
            count++;
        } while (i == 0);
        return 0;
    }*/

    public List<Card> getPlayerOne() {
        return playerOne;
    }

    public List<Card> getPlayerTwo() {
        return playerTwo;
    }
}
