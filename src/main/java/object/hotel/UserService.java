package object.hotel;

import java.util.List;

public class UserService {
    private Hotel hotel = new Hotel();

    public List<Room> getAllRooms() {
        return hotel.getRooms();
    }

    public List<Room> getNotOccupiedRooms() {
        return hotel.getNotOccupiedRooms();
    }

    public boolean bookRoom(int selectedNumberRoom) throws HotelExceptionRoom {
        Room room = hotel.findRoomByNumber(selectedNumberRoom);
        if(room.isOccupied()){
            throw new HotelExceptionRoom("This room is occupied");
        }
        return false;
    }

    public boolean releaseRoom(int number) {
        for (Room room :
                hotel.getRooms()) {
            int nrRoom = room.getNumberRoom();
            if (number == nrRoom) {
                if (room.isOccupied()) {
                    room.setOccupied(false);
                    return true;
                }
            }
        }
        return false;
    }




    /*
8. W klasie main utwórz proste menu do obsługi hotelu, przykłady implementacji (prosta pętla
do…while + switch):
1. https://stackoverflow.com/a/13536215/5877109
2. http://chronicles.blog.ryanrampersad.com/2011/03/text-based-menu-in-java/
9. Do menu dodaj funkcję:
1. Wyświetl listę pokoi wraz z ich statusem (wolny-zajęty) korzystając z HotelService.
2. Wyświetl listę tylko dostępnych pokoi.
3. Zarezerwuj pokój.
4. Zwolnij pokój.
10. Zapisz i zrób commit na nowej gałęzi a następnie wykonaj merge swojej gałęzi z developem i
usuń gałąź. Jeśli aplikacja działa bez zarzutów wykonaj także merge gałęzi develop do master
(żadnej z nich jednak nie usuwaj).*/
    }
