package object.task.card;

public class Card {
    Rank rank;
    Suit suit;
    Card(){

    }

    Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getPowerCard() {
        return rank.getPowerCard();
    }

    public int witchIsStronger(Card c1, Card c2){
        System.out.println("card one: " + c1);
        System.out.println("card two: " + c2);
        return c1.getPowerCard() > c2.getPowerCard() ? 1 : 2;
    }

    @Override
    public String toString() {
        return "Card: " + rank + " " +  suit;
    }
}
