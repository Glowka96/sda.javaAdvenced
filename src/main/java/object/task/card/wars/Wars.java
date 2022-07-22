package object.task.card.wars;

import object.task.card.MechanicGameException;

public class Wars {
    public static void main(String[] args) {
        WarsController warsController = new WarsController();
        try {
            warsController.startWars();
        } catch (MechanicGameException e) {
            throw new RuntimeException(e);
        }
    }
}
