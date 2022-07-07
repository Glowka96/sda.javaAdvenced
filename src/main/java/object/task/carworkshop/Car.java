package object.task.carworkshop;

import java.util.Arrays;
import java.util.Random;

public class Car {
    private Tire[] tires;

    Car(Tire[] tires){
        this.tires = tires;
    }

    public void flatRandomTire() {
        Random random = new Random();
        int tireIndex = random.nextInt(4);
        Tire tire = tires[tireIndex];
        tire.piercesTire();
    }

    @Override
    public String toString() {
        return "Car{" +
                "tires=" + Arrays.toString(tires) +
                '}';
    }

    public Tire[] getTires() {
        return tires;
    }

    public Tire getTire(int number){
        return tires[number];
    }
}
