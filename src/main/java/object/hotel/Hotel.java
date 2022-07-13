package object.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = initialization();
    }

    public List<Room> initialization() {
        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            rooms.add(new Room());
        }
        return rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Room> getNotOccupiedRooms() {
        List<Room> notOccupied = new ArrayList<>();
        for (Room room :
                rooms) {
            if (room.isOccupied()) {
                notOccupied.add(room);
            }
        }
        return notOccupied;
    }

    public Room findRoomByNumber(int selectedNumberRoom) throws HotelExceptionRoom {
        for (Room room :
                rooms) {
            if (room.getNumberRoom() == selectedNumberRoom) {
                return room;
            }
        }
        throw new HotelExceptionRoom("Not find room");
    }

    /*rooms.add(new Room(100, 2, false, false));
        rooms.add(new Room(100, 2, false, false));
        rooms.add(new Room(101, 3, true, false));
        rooms.add(new Room(102, 3, false, false));
        rooms.add(new Room(103, 3, false, false));
        rooms.add(new Room(104, 4, true, false));
        rooms.add(new Room(105, 4, false, false));
        rooms.add(new Room(106, 4, true, false));
        rooms.add(new Room(107, 4, false, false));
        rooms.add(new Room(108, 3, false, false));
        rooms.add(new Room(109, 3, true, false));
        rooms.add(new Room(110, 3, true, false));
        rooms.add(new Room(111, 3, true, false));
        rooms.add(new Room(112, 2, true, false));
        rooms.add(new Room(113, 2, true, false));*/
}
