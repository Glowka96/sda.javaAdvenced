package task.house;

import java.util.Arrays;
import java.util.Random;

public class Room {
    private Window[] windows;
    private Bed bed;

    Room(){
        windows = createTwoWindow();
        Random random = new Random();
        int dayAgo = random.nextInt(12)+5;
        bed = new Bed(dayAgo);
    }

    Room(Window[] windows, Bed bed) {
        this.windows = windows;
        this.bed = bed;
    }

    Window[] createTwoWindow(){
        windows = new Window[2];
        windows[0] = new Window();
        windows[1] = new Window();
        return windows;
    }

    @Override
    public String toString() {
        return "\nRoom{" +
                "windows=" + Arrays.toString(windows) +
                ", " + bed +
                "}";
    }

    void cleanRoom(){
        for (Window w :
                windows) {
            w.setOpenWindow();
        }
        bed.setNewLinen();
    }
}
