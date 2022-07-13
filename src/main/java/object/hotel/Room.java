package object.hotel;

import java.util.Random;

public class Room {
    private int numberRoom;
    private int capacity;
    private boolean withBathroom;
    private boolean occupied;

    private static int nextNr = 1;

    public Room(){
        numberRoom = nextNr++;
        Random random = new Random();
        capacity = random.nextInt();
        withBathroom = random.nextBoolean();
        occupied = random.nextBoolean();
    }

    public Room(int numberRoom, int capacity, boolean withBathroom, boolean occupied) {
        this.numberRoom = numberRoom;
        this.capacity = capacity;
        this.withBathroom = withBathroom;
        this.occupied = occupied;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "Room: numberRoom:" + numberRoom +
                ", howManyPerson: " + capacity +
                ", bathroom: " + withBathroom +
                ", occupied: " + occupied;
    }

    /*4. Dodaj klasę Room reprezentującą pojedynczy pokój (nr pokoju, ilu osobowy, czy w pokoju jest
łazienka - true/false oraz czy pokój jest dostępny - true/false).
5. Dodaj klasę Hotel która będzie zawierała listę pokoi.
6. W konstruktorze klasy Hotel utwórz kilka obiektów klasy Room i dodaj je do listy (np. 10-15),
dzięki temu podczas tworzenia instancji obiektu hotel, automatycznie generowana będzie lista
pokoi.
7. Dodaj klasę UserService która będzie służyć do obsługi hotelu. Na początek dodaj
funkcjonalności:
1. Pobierz listę wszystkich pokoi.
2. Pobierz listę wszystkich dostępnych pokoi.
3. Rezerwuj pokój (podaj nr pokoju i jeśli jest dostępny to go zarezerwuj).
4. Zwolnij pokój (podaj nr pokoju i jeśli jest zajęty to go zwolnij).
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
