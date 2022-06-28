package task.house;

import java.util.Arrays;

public class House {
    Room[] rooms = new Room[2];

    House(Room room, Room room2){
       this.rooms[0] = room;
       this.rooms[1] = room2;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
