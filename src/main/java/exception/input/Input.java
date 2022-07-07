package exception.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entered letter, error");
            return readNumber();
        }
    }


    public static void main(String[] args) {
        Input input = new Input();
        int number = input.readNumber();
        System.out.println(number);
    }
}
