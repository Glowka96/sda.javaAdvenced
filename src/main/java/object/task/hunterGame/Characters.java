package object.task.hunterGame;

import java.util.Random;

public class Characters {
    int x;
    int y;
    String aChar;

    public Characters(){}


    public Characters(String aChar) {
        Random random = new Random();
        this.x = random.nextInt(10);
        this.y = random.nextInt(10);
        this.aChar = aChar;
    }


}
