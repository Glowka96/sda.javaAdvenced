package object.task.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class MechanicGame {
    protected static final List<Card> cards = createPackOfCards();
    protected List<Player> players = new ArrayList<>();
    private Card card = new Card();

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

    public void howManyPlayers(int howMany) throws MechanicGameException {
        if (howMany < 5) {
            for (int i = 0; i < howMany; i++) {
                players.add(new Player());
            }
        } else {
            throw new MechanicGameException("To many players");
        }
    }

    public void addCardToPlayer(int howManyCard) {
        int count = 0;
        for (int i = 0; i < howManyCard; i++) {
            for (Player player : players) {
                player.getCardList().add(cards.get(count++));
            }
        }
    }

    public int whichCardIsStronger(Card c1, Card c2) {
        return card.witchIsStronger(c1, c2);
    }

    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "MechanicGame{" +
                "players=" + players +
                '}';
    }
}
