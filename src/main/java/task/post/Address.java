package task.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Address {
    private final String street;
    private final int numberHouse;
    private final String postcode;

    Address() {
        Random random = new Random();
        street = initializationAddressee().get(random.nextInt(20));
        numberHouse = random.nextInt(150);
        postcode = randomPostcode();
    }

    Address(String street, int numberHouse, String postcode) {
        this.street = street;
        this.numberHouse = numberHouse;
        this.postcode = postcode;
    }

    public List<String> initializationAddressee() {
        List<String> addressee = new ArrayList<>();
        addressee.add("Zawiszy Czarnego");
        addressee.add("Wojska Polskiego");
        addressee.add("Zgierska");
        addressee.add("Zachodnia");
        addressee.add("Wschodnia");
        addressee.add("Polnocna");
        addressee.add("Jaracza");
        addressee.add("Pilsudskiego");
        addressee.add("Kilinskiego");
        addressee.add("Zielona");
        addressee.add("Piotrkowska");
        addressee.add("Ogrodowa");
        addressee.add("Inflancka");
        addressee.add("Drewnowska");
        addressee.add("Organizacji WIN");
        addressee.add("Limanowskiego");
        addressee.add("Franciszkanska");
        addressee.add("Lagiewnicka");
        addressee.add("Brukowa");
        addressee.add("Palki");
        return addressee;
    }

    public String randomPostcode() {
        StringBuilder postcode = new StringBuilder();
        Random random = new Random();
        int rd;
        for (int i = 0; i < 5; i++) {
            rd = random.nextInt(10);
            postcode.append(rd);
            if(i == 1) {
                postcode.append("-");
            }
        }
        return postcode.toString();
    }

    @Override
    public String toString() {
        return "Address: " +
                "street: " + street + '\'' +
                ", numberHouse: " + numberHouse +
                ", postcode: " + postcode +
                '}';
    }
}
