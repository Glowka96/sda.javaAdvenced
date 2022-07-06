package task.dodgeGame;

import java.util.ArrayList;
import java.util.List;

public abstract class Characters {
    String aChar;

    Characters(String aChar) {
        this.aChar = aChar;
    }

    protected abstract void movement();
}
