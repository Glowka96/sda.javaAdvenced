package object.task.dodgeGame;

import static object.task.dodgeGame.Game.showBoard;

public class UserDemo {
    static int x2 = 3, y2 = 2;

    public static void main(String[] args) {
        User user = new User("X");
        user.movable.aMovable("UP");
        System.out.println(user.getX());
        System.out.println(user.getY());

        user.movement();

        System.out.println(user.getX());
        System.out.println(user.getY());


        Movement movement;
        String name = "A";
        //System.out.println(Movement.valueOf(name));

        for (int i = 0; i < 5; i++) {
            showBoard();
            user.x++;
            System.out.println();
            if(user.x == x2 && user.y == y2){
                System.out.println("game over");
                break;
            }

        }
    }
}
