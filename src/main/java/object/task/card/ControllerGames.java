package object.task.card;

import object.task.card.wars.MechanicGameWars;
import object.task.card.wars.WarsController;

import java.util.Scanner;

public class ControllerGames {
    public static void main(String[] args) {
        WarsController warsController = new WarsController();
        try {
            warsController.startWars();
        } catch (MechanicGameException e) {
            throw new RuntimeException(e);
        }

        /*Scanner scanner = new Scanner(System.in);
        System.out.println(gameWar.players);
        gameWar.addCardToPlayer(26);

        System.out.println(gameWar.players.get(0).getFirstCardWithTail().toString());

        System.out.println(gameWar.players.get(0));
        System.out.println(gameWar.players.get(1));*/
    }
    /*
     * Stworzyć menu z wyborem gry
     * Po wybraniu gry wybrać ilośc graczy(makao)
     * Rozdać karty graczom
     * Uruchomić gre
     *
     * Makao:
     * przy ruchu wyświetlanie kart gracza
     * wybór karty do położenia na stos
     * mechanika karty położonej na stos
     *
     * Implementacja mechaniki (rozdawanie kart dla graczy itd)
     * */

}
