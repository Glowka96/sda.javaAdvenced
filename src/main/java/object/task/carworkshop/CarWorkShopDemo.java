package object.task.carworkshop;

public class CarWorkShopDemo {
    public static void main(String[] args) {
        Tire[] tires = createTireForCar();
        Car car = new Car(tires);
        System.out.println(car);
        car.flatRandomTire();
        System.out.println(car);
        CarWorkShop carWorkShop = new CarWorkShop();
        Receipt receipt = carWorkShop.repairTire(car);
        receipt.printReceipt();

    }

    public static Tire[] createTireForCar() {
        Tire[] tires = new Tire[4];
        tires[0] = new Tire();
        tires[1] = new Tire();
        tires[2] = new Tire();
        tires[3] = new Tire();
        return tires;
    }
}
