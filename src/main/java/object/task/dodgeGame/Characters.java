package object.task.dodgeGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Characters {
    String aChar;
    int x;
    int y;

    Characters(String aChar) {
        Random random = new Random();
        this.aChar = aChar;
        x = random.nextInt(10);
        y = random.nextInt(10);
    }

    protected abstract void movement();
}
