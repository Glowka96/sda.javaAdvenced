package object.task.dodgeGame;


import static object.task.dodgeGame.Movement.*;

public class Movable {
    Movement movement;
    Characters characters;

    void Movable() {
        switch (movement) {
            case UP:
                characters.y++;
                break;
            case DOWN:
                characters.y--;
                break;
            case RIGHT:
                characters.x++;
                break;
            case LEFT:
                characters.x--;
                break;
        }
    }
}
