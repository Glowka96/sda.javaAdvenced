package inheritance.vehicle;

public abstract class Vehicle {
    private boolean vehicle;
    private int maxSpeed;
    private int number;
    private Depot depot;

    public Vehicle(boolean vehicle, int maxSpeed, int number, Depot depot) {
        this.vehicle = vehicle;
        this.maxSpeed = maxSpeed;
        this.number = number;
        this.depot = depot;
    }
}
