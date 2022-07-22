package object.task.card;

public class Card{
    Rank rank;
    Suit suit;
    public Card(){
    }

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Card(Card card){
        rank = card.rank;
        suit = card.suit;
    }

    public int getPowerCard() {
        return rank.getPowerCard();
    }

    public int witchIsStronger(Card c1, Card c2){
        int ic1 = c1.getPowerCard();
        int ic2 = c2.getPowerCard();
        if(ic1 > ic2) {
            return 1;
        } else if (ic1 < ic2) {
            return 2;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Card: " + rank + " " +  suit;
    }
}
