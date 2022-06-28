package task.house;

public class Main {
    public static void main(String[] args) {
        Window[] windows4 = createArrayWindows(4);
        windows4 = openedWindow(windows4);

        Room room = new Room();

        Bed bed = new Bed(3);
        Room room1 = new Room(windows4, bed);

        Room[] rooms = new Room[2];
        rooms[0] = room;
        rooms[1] = room1;

        House house = new House(rooms);
        System.out.println(house);
        house.getRoom(0).cleanRoom();
        System.out.println(house);
    }


    static Window[] createArrayWindows(int howManyWindow) {
        Window[] windows = new Window[howManyWindow];
        for (int i = 0; i < howManyWindow; i++) {
            windows[i] = new Window();
        }
        return windows;
    }

    static Window[] openedWindow(Window[] windows){
        for (Window window :
                windows) {
            window.setOpenWindow();
        }
        return windows;
    }
}
