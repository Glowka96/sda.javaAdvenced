package object.task.dodgeGame;

public class Game {
    static int x = 0, y = 2;
    static int x1 = 6, y1 = 1;
    static int x2 = 3, y2 = 2;
    static int x3 = 7, y3 = 3;

    public static void main(String[] args) {
        User user = new User("x");
        user.movement();
        Movement movement;
        String name = "A";
        //System.out.println(Movement.valueOf(name));


        for (int i = 0; i < 5; i++) {
            showBoard();
            x++;
            System.out.println();
            if(x == x2 && y == y2){
                System.out.println("game over");
                break;
            }
            if(i % 2 == 0) {
                x1++;
            }
        }
    }


    static void showBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == y && x == j) {
                    System.out.print("X");
                    continue;
                }
                if (i == y1 && x1 == j) {
                    System.out.print("X");
                    continue;
                }
                if (i == y2 && x2 == j) {
                    System.out.print("X");
                    continue;
                }
                if (i == y3 && x3 == j) {
                    System.out.print("X");
                    continue;
                }
                System.out.print(".");
            }
            System.out.println();
        }
    }
}

