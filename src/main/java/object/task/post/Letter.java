package object.task.post;

import java.util.Random;

public class Letter {
    private final Address aSender;
    private final Address aAddressee;
    private final Boolean priority;
    private Enum status;

    Letter(){
        aSender = new Address();
        aAddressee = new Address();
        Random random = new Random();
        int randomPriority = random.nextInt(2);
        priority = randomPriority == 0;
        status = Status.CREATED;
    }

    Letter(Address aSender, Address aAddressee, boolean priority){
        this.aSender = aSender;
        this.aAddressee = aAddressee;
        this.priority = priority;
        status = Status.CREATED;
    }

    public boolean isPriority() {
        return priority;
    }

    public double priceLetter(){
        return this.priority ? 8.5 : 6;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "Sender=" + aSender +
                ", Addressee=" + aAddressee +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
    }
}
