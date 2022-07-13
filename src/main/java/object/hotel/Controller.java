package object.hotel;

import java.util.List;
import java.util.Scanner;

public class Controller {
    private static UserService service = new UserService();
    private boolean running = true;

    public void startMenu() {
        do {
            try {
                showMenuChoice();
                int input = printNumberForUser();
                showMenu(input);
            } catch (HotelExceptionRoom e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (running);
    }

    public void showMenu(int number) throws HotelExceptionRoom {
        switch (number) {
            case 1:
                showRooms(service.getAllRooms());
                break;
            case 2:
                showRooms(service.getNotOccupiedRooms());
                break;
            case 3:
                bookRoom();
                break;
            case 4:
                System.out.println("Enter the room number you want to release");
                int nrRoomForUser2 = printNumberForUser();
                if (service.releaseRoom(nrRoomForUser2)) {
                    System.out.println("Room is release");
                } else {
                    System.out.println("This room is available. You don't release this room.");
                }
                break;
            case 0:
                System.out.println("Close program.");
                running = false;
                break;
            default:
                System.out.println("You entered wrong number");
        }
    }

    private void bookRoom() throws HotelExceptionRoom {
        System.out.println("Enter the room number you want to reserve");
        int nrRoomForUser = printNumberForUser();
        service.bookRoom(nrRoomForUser);
        System.out.println("Room is reserve");
    }


    private void showRooms(List<Room> rooms) {
        for (Room room :
                rooms) {
            System.out.println(room);
        }
    }

    public void showMenuChoice() {
        System.out.println("1. Show hotel rooms" +
                "\n2. Show hotel rooms is available" +
                "\n3. Reservation room" +
                "\n4. Release room" +
                "\n0. Close" +
                "\nEnter number what you want to do:");
    }

    public int printNumberForUser() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            printNumberForUser();
        }
        return number;
    }
}
