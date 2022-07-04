package task.carworkshop;

public class CarWorkShop {

    private final static double PRICE = 50;
    private final static String DEFAULT_REPAIR_TYPE = "Change tire: ";

    CarWorkShop() {
    }

    public Receipt repairTire(Car car) {
        int count = 0;
        for (Tire tire :
                car.getTires()) {
            if (tire.isPierced()) {
                count++;
                tire.newTire();
            }
        }
        return new Receipt(DEFAULT_REPAIR_TYPE, count, PRICE);
    }
}
