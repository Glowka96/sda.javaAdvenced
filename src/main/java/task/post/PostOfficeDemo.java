package task.post;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PostOfficeDemo {

    public static void main(String[] args) throws IOException {
        List<Package> packages = initializationArrayPackage();
        showPackages(packages);

        PostOffice postOffice = new PostOffice();
        postOffice.packagesToBeSent(packages);
        postOffice.showSentPackages();
        postOffice.showProfitPackage();

        /*Package pack = new Package(null, null, 200_200, true);
        postOffice.sendParcel(pack, 1000);


        Package pack = postOffice.createPackage();
        System.out.println(pack);
        postOffice.sendParcel(pack, 50);*/

        postOffice.lastSendPackage();

        Address address = new Address("Franciszkanska", 59, "91-850");
        Address address2 = new Address("Strykowska", 13, "90-470");
        Letter letter = new Letter(address, address2, true);

        postOffice.acceptLetter(letter, 10);

        List<Letter> letters = initializationArrayLetter();
        showLetters(letters);

        postOffice.lettersToBeAccept(letters);
        postOffice.showAcceptLetters();

        postOffice.lettersToBeSend();
        postOffice.showSentLetters();

        postOffice.removeSentLetterWithAccept();

        System.out.println("Letters to be sent tomorrow: ");
        postOffice.showAcceptLetters();

        postOffice.showProfitLetter();
    }


    public static List<Package> initializationArrayPackage() {
        List<Package> packages = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            packages.add(new Package());
        }
        return packages;
    }

    public static List<Letter> initializationArrayLetter() {
        List<Letter> letters = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            letters.add(new Letter());
        }
        return letters;
    }

    public static void showPackages(List<Package> packages) {
        for (Package aPackage :
                packages) {
            System.out.println(aPackage);
        }
    }

    public static void showLetters(List<Letter> letters) {
        for (Letter letter :
                letters) {
            System.out.println(letter);
        }
    }
}
