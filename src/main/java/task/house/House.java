package task.house;

import java.util.Arrays;

public class House {
    private Room[] rooms;

    House(Room[] rooms){
       this.rooms = rooms;
    }

    public Room getRoom(int number){
        if(number > rooms.length) {
            return rooms[0];
        }
        return rooms[number];
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
