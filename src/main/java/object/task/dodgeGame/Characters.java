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

    public String getaChar() {
        return aChar;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setaChar(String aChar) {
        this.aChar = aChar;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    protected abstract void movement();
}
