package object.task.card;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cardList = new ArrayList<>();

    public Player(){};

    /*public Player(List<Card> cardList) {
        this.cardList = cardList;
    }*/

    public List<Card> getCardList() {
        return cardList;
    }

    public Card getFirstCardWithTail(){
        return cardList.get(0);
    }

    public void removeFirstCartWithTail(){
        cardList.remove(0);
    }

    public void addCardToTail(List<Card> cards){
        cardList.addAll(cards);
    }

    @Override
    public String toString() {
        return "Player{" +
                "cardList=" + cardList +
                '}';
    }
}
