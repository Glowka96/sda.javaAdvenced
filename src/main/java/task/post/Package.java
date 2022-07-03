package task.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Package {
    private String sender;
    private String addressee;
    private int weight;
    private boolean priority;
    private Enum status;

    Package() {
        Random random = new Random();
        sender = listName().get(random.nextInt(30));
        addressee = listName().get(random.nextInt(30));
        weight = random.nextInt(100_000) + 1;
        int randomPriority = random.nextInt(2);
        priority = randomPriority == 0;
        status = Status.CREATED;
    }

    Package(String sender, String addressee, int weight, boolean priority) {
        boolean isCreated = true;
        if (sender == null || addressee == null) {
            System.out.println("Error, the sender/addressee cannot be null");
            isCreated = false;
        }
        if (weight < 1 || weight > 100_00) {
            System.out.println("Error, incorrect weight");
            isCreated = false;
        }
        if (isCreated) {
            this.sender = sender;
            this.addressee = addressee;
            this.priority = priority;
            status = Status.CREATED;
        } else {
            status = Status.DELETED;
        }
    }

    public int pricePackage() {
        int price = 0;
        if (this.weight >= 1 && weight < 5000) {
            price = 5;
        } else if (this.weight > 5000 && this.weight < 10_000) {
            price = 8;
        } else if (this.weight >= 10_000 && this.weight < 20_000) {
            price = 12;
        } else if (this.weight >= 20_000) {
            price = 12 + (this.weight - 2000) / 1000;
        }
        if (this.priority) {
            price = (int) (price + (price * 0.1));
        }
        return price;
    }

    public List<String> listName() {
        List<String> names = new ArrayList<>();
        names.add("Sebastian");
        names.add("Damian");
        names.add("Tomek");
        names.add("Robert");
        names.add("Kuba");
        names.add("Agnieszka");
        names.add("Iza");
        names.add("Zofia");
        names.add("Hubert");
        names.add("Paulina");
        names.add("Eliza");
        names.add("Anna");
        names.add("Karolina");
        names.add("Piotr");
        names.add("Sylwek");
        names.add("Krzysztof");
        names.add("Sylwia");
        names.add("Kamil");
        names.add("Magda");
        names.add("Lukasz");
        names.add("Dagmara");
        names.add("Rafal");
        names.add("Roksana");
        names.add("Dawid");
        names.add("Daniel");
        names.add("Szymon");
        names.add("Zuzanna");
        names.add("Aleksandra");
        names.add("Wiola");
        names.add("Filip");
        return names;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Package{" +
                "Sender: " + sender + '\'' +
                ", Addressee: " + addressee + '\'' +
                ", Weight: " + weight +
                ", Priority: " + priority +
                ", status: " + status +
                '}';
    }
}


