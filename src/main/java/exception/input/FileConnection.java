package exception.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileConnection {
    private boolean connected = false;

    public void connected() throws FileConnectionException {
        Random random = new Random();
        double randomPercent = random.nextDouble();
        if (randomPercent < 0.25) {
            throw new FileConnectionException();
        }
    }


    public List<Book> readBooks() throws BookMappingException {
        List<Book> booksList = new ArrayList<>();
        File file = new File("src\\main\\java\\book.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Book book = mapLineToBook(line);
                booksList.add(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
            e.printStackTrace();
        }
        return booksList;
    }

    private Book mapLineToBook(String line) throws BookMappingException {
        try {
            String[] element = line.split(";");
            String title = element[0];
            String year = element[1];
            Book book = new Book(title, Integer.parseInt(year));
            return book;
        } catch (Exception e) {
            System.out.println("Error, invalid file format");
            //throw new Exception("Invalid file format for line" + line);
            throw new BookMappingException("Invalid file format", line);
        }
    }


    /*public static void main(String[] args) {
        Input input = new Input();
        try {
            System.out.println(input.readBooks());
        } catch (BookMappingException e) {
            System.out.println("occurred exception");
            System.out.println(e.getMessage());
            System.out.println(e.getLine());
        }
    }*/

    public void connect() {
    }
}

