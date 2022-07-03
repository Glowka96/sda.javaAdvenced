package task.post;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static task.post.Status.*;

public class PostOffice {
    private List<Package> packages = new ArrayList<>();
    private List<Letter> acceptLetters = new ArrayList<>();
    private List<Letter> sendLetters = new ArrayList<>();
    private int profitPackage = 0;
    private int profitLetter = 0;

    public void sendParcel(Package aPackage, int money) {
        if (aPackage.getStatus().equals(DELETED)) {
            return;
        }
        int cost = aPackage.pricePackage();
        if (cost < money) {
            System.out.println("Money: " + money + ". Send package, cost send: " + cost);
            aPackage.setStatus(SENT);
            this.profitPackage += cost;
            packages.add(aPackage);
            System.out.println("Rest: " + (money - cost));
        } else {
            System.out.println("Not enough money");
        }
    }

    public void packagesToBeSent(List<Package> aPackages) {
        Random random = new Random();
        for (Package aPackage : aPackages) {
            int randomMoney = random.nextInt(80);
            sendParcel(aPackage, randomMoney);
        }
        System.out.println();
    }

    public void lastSendPackage() {
        System.out.println(packages.get(packages.size() - 1) + "\n");
    }

    public Package createPackage() throws IOException {
        System.out.println("Enter sender's name:");
        String nameSender = printName();
        System.out.println("Enter addressee's name:");
        String nameAddressee = printName();
        System.out.println("Enter priority package: ");
        boolean isPriority = isPriority();
        System.out.println("Enter weight package: ");
        int weight = printWeight();
        return new Package(nameSender, nameAddressee, weight, isPriority);
    }

    public String printName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]*");
        Matcher matcher;
        String name;
        do {
            name = reader.readLine();
            matcher = pattern.matcher(name);
        } while (!matcher.matches());
        return name;
    }

    public boolean isPriority() {
        Scanner scanner = new Scanner(System.in);
        String priority;
        do {
            priority = scanner.nextLine().toLowerCase();
        } while (priority.matches("yes | no"));
        return priority.equals("yes");
    }

    public int printWeight() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher;
        String weight;
        do {
            weight = reader.readLine();
            matcher = pattern.matcher(weight);
        } while (!matcher.matches());
        return Integer.parseInt(weight);
    }

    public void acceptLetter(Letter letter, int money) {
        double cost = letter.priceLetter();
        if (cost < money) {
            System.out.println("Money: " + money + ". Send letter, cost send: " + cost);
            letter.setStatus(ACCEPTED);
            this.profitLetter += cost;
            acceptLetters.add(letter);
            System.out.println("Rest: " + (money - cost));
        } else {
            System.out.println("Not enough money");
        }
    }

    public void lettersToBeAccept(List<Letter> letters) {
        for (Letter letter :
                letters) {
            Random random = new Random();
            int randomMoney = random.nextInt(20);
            acceptLetter(letter, randomMoney);
        }
        System.out.println();
    }

    public void lettersToBeSend() {
        sortLetterForPriority();
        for (Letter letter :
                acceptLetters) {
            sendLetters.add(letter);
            if (this.sendLetters.lastIndexOf(letter) == 9) {
                System.out.println("Sorry, we are unable to send any more letters today");
                return;
            }
        }
    }
    
    public void removeSentLetterWithAccept(){
        for (Letter letter :
                sendLetters) {
            acceptLetters.remove(letter);
        }
    }

    public void sortLetterForPriority() {
        acceptLetters.sort((letter, t1) -> {
            boolean b1 = letter.isPriority();
            boolean b2 = t1.isPriority();
            return (b1 == b2) ? 0 : b2 ? 1 : -1;
        });
    }

    public void showSentPackages() {
        for (Package aPackage :
                packages) {
            System.out.println(aPackage);
        }
        System.out.println();
    }

    public void showAcceptLetters() {
        for (Letter letter :
                acceptLetters) {
            System.out.println(letter);
        }
        System.out.println();
    }

    public void showSentLetters() {
        for (Letter letter :
                sendLetters) {
            System.out.println(letter);
        }
        System.out.println();
    }

    public void showProfitPackage() {
        System.out.println("Post Office profit for packages: " + profitPackage);
    }

    public void showProfitLetter() {
        System.out.println("Post Office profit for letters: " + profitLetter);
    }
}
