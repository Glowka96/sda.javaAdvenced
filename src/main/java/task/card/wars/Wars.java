package task.card.wars;

import task.card.MechanicCard;

public class Wars {
    public static void main(String[] args) {
        MechanicCard mechanicCard = new MechanicCard();
        int one;
        int two;
        do {
            one = mechanicCard.getPlayerOne().size();
            two = mechanicCard.getPlayerTwo().size();
            if (one == 0 || two == 0) {
                break;
            }
            mechanicCard.placeBets();
            System.out.println(mechanicCard.getPlayerOne());
            System.out.println(mechanicCard.getPlayerTwo());
        } while (one != 0 || two != 0);

    }
}
