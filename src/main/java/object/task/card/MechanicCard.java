package object.task.card;

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
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                packOfCards.add(new Card(ranks[j], suits[i]));
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

    public void placeBets() {
        Card c1 = getPlayerOne().get(0);
        Card c2 = getPlayerTwo().get(0);
        Card c3;
        int i = card.witchIsStronger(c1, c2);
        if (i == 1) {
            System.out.println("Winner player one");
            getPlayerOne().add(c2);
            getPlayerTwo().remove(c2);
            c3 = getPlayerOne().get(0);
            getPlayerOne().remove(c1);
            getPlayerOne().add(c3);
        } else {
            System.out.println("Winner player two");
            getPlayerTwo().add(c1);
            getPlayerOne().remove(c1);
            c3 = getPlayerTwo().get(0);
            getPlayerTwo().remove(c2);
            getPlayerTwo().add(c3);
        }
    }


    public List<Card> getPlayerOne() {
        return playerOne;
    }

    public List<Card> getPlayerTwo() {
        return playerTwo;
    }
}
