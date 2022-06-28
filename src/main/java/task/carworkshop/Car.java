package task.carworkshop;

import java.util.Arrays;

public class Car {
    private Tire[] tires;

    Car(Tire[] tires){
        this.tires = tires;
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
