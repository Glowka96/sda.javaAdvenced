package object.task.card.wars;

import object.task.card.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MechanicGameWars extends MechanicGame {
    private List<Card> stack = new ArrayList<>();
    public MechanicGameWars() {
    }

    public void placeBets() {
        Card c1 = players.get(0).getFirstCardWithTail();
        Card c2 = players.get(1).getFirstCardWithTail();
        stack.add(c1);
        stack.add(c2);
    }

    public void removeStack() {
        stack.clear();
    }

    public void removePlayerFirstCard() {
        players.get(0).removeFirstCartWithTail();
        players.get(1).removeFirstCartWithTail();
    }

    public void addCardsToWinner(int i) {
        Collections.shuffle(stack);
        players.get(i-1).getCardList().addAll(stack);
    /*    if(i == 1) {
            players.get(0).addCardToTail(stack);
        } else {
            players.get(1).addCardToTail(stack);
        }*/
    }

    public boolean endgame() {
        return  players.get(0).getCardList().size() == 0 || players.get(1).getCardList().size() == 0;
    }

    public Player whoWinner() {
        return players.get(0).getCardList().size() == 0 ? players.get(0) : players.get(1);
    }
}



